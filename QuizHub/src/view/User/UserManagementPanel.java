package view.User;

import controller.UserController;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.User;
import services.AuthService;

public class UserManagementPanel extends javax.swing.JPanel {

    private final UserController userController;
    private final AuthService authService;
    private String username;
    private String password;
    private String fullname;
    private String email;
    private String role;

    public UserManagementPanel() {
        userController = new UserController();
        this.authService = new AuthService();

        initComponents();

        loadUsers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtFullname = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        cbxRole = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();

        jTextField2.setText("jTextField2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(1000, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Username:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Password:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Full Name:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Role:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Email:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        btnAdd.setBackground(new java.awt.Color(0, 153, 51));
        btnAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add User");
        btnAdd.setToolTipText("Click to add a new user");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 30));

        btnUpdate.setBackground(new java.awt.Color(0, 51, 204));
        btnUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update User");
        btnUpdate.setToolTipText("Click to update a user");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, 30));

        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete User");
        btnDelete.setToolTipText("Click to delete a user");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, 30));

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 260, 30));

        txtUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 26, 260, 30));

        txtFullname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txtFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 260, 30));

        txtPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 260, 30));

        cbxRole.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn 1 option", "Admin", "Teacher", "Student" }));
        jPanel2.add(cbxRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 260, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 950, 330));
        jPanel2.getAccessibleContext().setAccessibleName("");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Management");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 37, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 100));

        tblUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Fullname", "Email", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblUser);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 950, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteUser();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        txtPassword.setEditable(true);
        txtUsername.setEditable(true);

        username = txtUsername.getText();
        password = new String(txtPassword.getPassword());
        fullname = txtFullname.getText();
        email = txtEmail.getText();
        role = cbxRole.getSelectedItem().toString();

        if (username.trim().isEmpty()) {
            showErrorMessage("Username is required!");
            return;
        } else if (password.trim().isEmpty()) {
            showErrorMessage("Password is required!");
            return;
        } else if (fullname.trim().isEmpty()) {
            showErrorMessage("Fullname is required!");
            return;
        } else if (email.trim().isEmpty()) {
            showErrorMessage("Email is required!");
            return;
        } else if (cbxRole.getSelectedIndex() == 0) {
            showErrorMessage("Role is required!");
            return;
        }

        boolean userIsExists = this.authService.isUserExists(username);
        if (userIsExists) {
            showErrorMessage("Username is exists!");
            return;
        }

        if (!isValidEmail(email)) {
            showErrorMessage("Email is not valid!");
            return;
        }

        addUser(username, password, fullname, email, role);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectedRow = tblUser.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to update!");
            return;
        }

        username = txtUsername.getText();
        password = new String(txtPassword.getPassword());
        fullname = txtFullname.getText();
        email = txtEmail.getText();
        role = cbxRole.getSelectedItem().toString();

        if (fullname.trim().isEmpty()) {
            showErrorMessage("Fullname is required!");
            return;
        } else if (email.trim().isEmpty()) {
            showErrorMessage("Email is required!");
            return;
        } else if (cbxRole.getSelectedIndex() == 0) {
            showErrorMessage("Role is required!");
            return;
        }

        if (!isValidEmail(email)) {
            showErrorMessage("Email is not valid!");
            return;
        }

        modifyUser(username, password, fullname, email, role);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserMouseClicked
        int row = tblUser.getSelectedRow();
        if (row != -1) {
            txtUsername.setText(tblUser.getValueAt(row, 0).toString());
            txtFullname.setText(tblUser.getValueAt(row, 1).toString());
            txtEmail.setText(tblUser.getValueAt(row, 2).toString());
            
            var role = tblUser.getValueAt(row, 3);
            role = role == null ? "Chọn 1 option" : role.toString();
            cbxRole.setSelectedItem(tblUser.getValueAt(row, 3).toString());

            txtPassword.setEditable(false);
            txtUsername.setEditable(false);
        }
    }//GEN-LAST:event_tblUserMouseClicked

    private void loadUsers() {
        DefaultTableModel userModel = (DefaultTableModel) tblUser.getModel();
        userModel.setRowCount(0); // Clear existing rows

        List<User> users = userController.listUsers();
        for (User user : users) {
            userModel.addRow(new Object[]{user.getUserName(), user.getFullName(), user.getEmail(), user.getRole()});
        }
    }

    private void addUser(String username, String password, String fullname, String email, String role) {
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setFullName(fullname);
        user.setRole(role);

        int insertResult = userController.addUser(user);
        String message = insertResult > 0 ? "successfully" : "failed";
        JOptionPane.showMessageDialog(this, String.format("User added %s!", message));

        loadUsers();
        clearFields();
    }

    private void modifyUser(String username, String password, String fullname, String email, String role) {
        User user = new User();
        user.setUserName(username);
        user.setEmail(email);
        user.setFullName(fullname);
        user.setRole(role);

        int updateResult = userController.modifyUser(user);
        String message = updateResult > 0 ? "successfully" : "failed";
        JOptionPane.showMessageDialog(this, String.format("User update %s!", message));

        loadUsers();
        clearFields();
    }

    private void deleteUser() {
        int selectedRow = tblUser.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to delete!");
            return;
        }

        DefaultTableModel userModel = (DefaultTableModel) tblUser.getModel();
        String username = (String) userModel.getValueAt(selectedRow, 0);

        int deleteResult = userController.removeUser(username);
        String message = deleteResult > 0 ? "successfully" : "failed";
        JOptionPane.showMessageDialog(this, String.format("User remove %s!", message));

        loadUsers();
        clearFields();
    }

    private void clearFields() {
        txtUsername.setText("");
        txtPassword.setText("");
        txtEmail.setText("");
        txtFullname.setText("");
        cbxRole.setSelectedIndex(0);
    }

    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Input Error", JOptionPane.ERROR_MESSAGE);
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
