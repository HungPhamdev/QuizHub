package view.Auth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Login2Panel extends JPanel {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private boolean loginSuccessful; // Track login success

    public Login2Panel() {
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        // Create the login button without an action listener initially
        loginButton = new JButton("Login");
        add(loginButton);
    }

    // Method to set the action listener for the login button
    public void setLoginAction(ActionListener actionListener) {
        loginButton.addActionListener(actionListener);
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public void setLoginSuccessful(boolean status) {
        this.loginSuccessful = status; // Set the login status
    }

    public boolean isLoginSuccessful() {
        return loginSuccessful; // Return the current status
    }
}
