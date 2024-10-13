package controller;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.DatabaseConnection;

import java.awt.*;
import java.sql.*;

public class StudentManagement extends JFrame {
    private JTable studentTable;
    private DefaultTableModel tableModel;
    private JTextField nameField;
    private JTextField emailField;

    public StudentManagement() {
        setTitle("Student Management");
        setSize(600, 400);
        setLocationRelativeTo(null);

        tableModel = new DefaultTableModel(new String[]{"ID", "Name", "Email"}, 0);
        studentTable = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(studentTable);

        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Email:"));
        emailField = new JTextField();
        inputPanel.add(emailField);

        JButton addButton = new JButton("Add");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);

        add(tableScrollPane, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);

        loadStudentData();

        addButton.addActionListener(e -> addStudent());
        updateButton.addActionListener(e -> updateStudent());
        deleteButton.addActionListener(e -> deleteStudent());

        setVisible(true);
    }

    private void loadStudentData() {
        tableModel.setRowCount(0); // Clear existing data
        String sql = "SELECT id, name, email FROM students";
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                tableModel.addRow(new Object[]{id, name, email});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading students: " + e.getMessage());
        }
    }

    private void addStudent() {
        String name = nameField.getText();
        String email = emailField.getText();
        String sql = "INSERT INTO students (name, email) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.executeUpdate();
            loadStudentData();
            nameField.setText("");
            emailField.setText("");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error adding student: " + e.getMessage());
        }
    }

    private void updateStudent() {
        int selectedRow = studentTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Select a student to update.");
            return;
        }

        int id = (int) tableModel.getValueAt(selectedRow, 0);
        String name = nameField.getText();
        String email = emailField.getText();
        String sql = "UPDATE students SET name = ?, email = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
            loadStudentData();
            nameField.setText("");
            emailField.setText("");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating student: " + e.getMessage());
        }
    }

    private void deleteStudent() {
        int selectedRow = studentTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Select a student to delete.");
            return;
        }

        int id = (int) tableModel.getValueAt(selectedRow, 0);
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            loadStudentData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error deleting student: " + e.getMessage());
        }
    }
}
