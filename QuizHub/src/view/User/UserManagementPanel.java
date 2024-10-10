package view.User;

import controller.UserController;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import model.User;

public class UserManagementPanel extends JPanel {
    private UserController userController;
    private JList<User> userList;
    private DefaultListModel<User> userListModel;
    private JTextField userNameField;
    private JPasswordField passwordField;
    private JTextField emailField;
    private JTextField fullNameField;
    private JTextField roleField;
    private JTable userTable;
    private DefaultTableModel tableModel;

    public UserManagementPanel() {
        userController = new UserController();
        setLayout(new BorderLayout());

        // Create a list model and JList
        userListModel = new DefaultListModel<>();
        userList = new JList<>(userListModel);
        userList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        userList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                User selectedUser = userList.getSelectedValue();
                if (selectedUser != null) {
                    userNameField.setText(selectedUser.getUserName());
                    passwordField.setText(selectedUser.getPassword()); // For demonstration only
                    emailField.setText(selectedUser.getEmail());
                    fullNameField.setText(selectedUser.getFullName());
                    roleField.setText(selectedUser.getRole());
                }
            }
        });

        // Adding components to the panel
        add(new JScrollPane(userList), BorderLayout.WEST);
        
        // Input Panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));
        
        inputPanel.add(new JLabel("Username:"));
        userNameField = new JTextField();
        inputPanel.add(userNameField);
        
        inputPanel.add(new JLabel("Password:"));
        
        passwordField = new JPasswordField();
        inputPanel.add(passwordField);
        
        inputPanel.add(new JLabel("Email:"));
        emailField = new JTextField();
        inputPanel.add(emailField);
        
        inputPanel.add(new JLabel("Full Name:"));
        fullNameField = new JTextField();
        inputPanel.add(fullNameField);
        
        inputPanel.add(new JLabel("Role:"));
        roleField = new JTextField();
        inputPanel.add(roleField);

        add(inputPanel, BorderLayout.NORTH);

        // Buttons
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Add User");
        JButton updateButton = new JButton("Update User");
        JButton deleteButton = new JButton("Delete User");
        updateButton.addActionListener(new UpdateButtonListener());
        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        add(buttonPanel, BorderLayout.CENTER);

        // User Table
        tableModel = new DefaultTableModel(new String[]{"ID", "Username", "Email", "Full Name", "Role"}, 0);
        userTable = new JTable(tableModel);
        add(new JScrollPane(userTable), BorderLayout.SOUTH);

        // Button Action Listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addUser();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateUser();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteUser();
            }
        });

        loadUsers();
    }

    private void loadUsers() {
        tableModel.setRowCount(0); // Clear existing data
        List<User> users = userController.listUsers();
        for (User user : users) {
            tableModel.addRow(new Object[]{user.getId(), user.getUserName(), user.getEmail(), user.getFullName(), user.getRole()});
        }
    }

    private void addUser() {
        User user = new User();
        user.setUserName(userNameField.getText());
        user.setPassword(passwordField.getText());
        user.setEmail(emailField.getText());
        user.setFullName(fullNameField.getText());
        user.setRole(roleField.getText());
        userController.addUser(user);
        loadUsers();
        clearFields();
    }
    
    private class UpdateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            User selectedUser = userList.getSelectedValue();
            if (selectedUser != null) {
                // Update logic (e.g., update in the database)
                String username = userNameField.getText();
                String password = String.valueOf(passwordField.getPassword());
                String email = emailField.getText();
                String fullName = fullNameField.getText();
                String role = roleField.getText();

                // Update the user (replace this with actual update logic)
                System.out.println("Updating user: " + username + ", " + email + ", " + fullName + ", " + role);
                // For example, update the database or model here
            } else {
                JOptionPane.showMessageDialog(UserManagementPanel.this, "Select a user to update.");
            }
        }
    }

    private void updateUser() {
        int selectedRow = userTable.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) tableModel.getValueAt(selectedRow, 0);
            User user = new User();
            user.setId(id);
            user.setUserName(userNameField.getText());
            user.setPassword(passwordField.getText());
            user.setEmail(emailField.getText());
            user.setFullName(fullNameField.getText());
            user.setRole(roleField.getText());
            userController.modifyUser(user);
            loadUsers();
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a user to update.");
        }
    }

    private void deleteUser() {
        int selectedRow = userTable.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) tableModel.getValueAt(selectedRow, 0);
            userController.removeUser(id);
            loadUsers();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a user to delete.");
        }
    }

    private void clearFields() {
        userNameField.setText("");
        passwordField.setText("");
        emailField.setText("");
        fullNameField.setText("");
        roleField.setText("");
    }
}
