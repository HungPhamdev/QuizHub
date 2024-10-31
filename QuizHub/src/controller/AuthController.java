package controller;

import model.User;
import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import services.AuthService;
import org.mindrot.jbcrypt.BCrypt;
//import view.Auth.LoginPanel;

public class AuthController {

    private AuthService authService;

    public AuthController() {
        this.authService = new AuthService();
    }

//    public boolean showLogin() {
//        // Create a modal dialog for the login panel
//        JDialog dialog = new JDialog();
//        dialog.setTitle("Login");
//
//        // Initialize the loginPanel first
//        LoginPanel loginPanel = new LoginPanel();
//
//        // Set the action listener for the login button
//        loginPanel.setLoginAction(e -> login(loginPanel, dialog));
//
//        dialog.add(loginPanel);
//        dialog.pack();
//        dialog.setModal(true); // Make it modal
//        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//        dialog.setLocationRelativeTo(null); // Center the dialog
//        dialog.setVisible(true); // Show the dialog
//
//        return loginPanel.isLoginSuccessful(); // Return the login status from the panel
//    }
//
//    private void login(LoginPanel panel, JDialog dialog) {
//        User user = authService.login(panel.getUsername(), panel.getPassword());
//        if (user != null) {
//            panel.setLoginSuccessful(true); // Indicate successful login
//            JOptionPane.showMessageDialog(dialog, "Login successful! Welcome, " + user.getFullName());
//            dialog.dispose(); // Close the dialog
//        } else {
//            JOptionPane.showMessageDialog(dialog, "Invalid username or password.");
//            panel.setLoginSuccessful(false); // Set to false if login fails
//        }
//    }
}
