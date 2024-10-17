package view.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RegistrationPanel extends JPanel {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField emailField;
    private JTextField fullNameField;

    public RegistrationPanel() {
        setLayout(new GridLayout(6, 2));
        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Full Name:"));
        fullNameField = new JTextField();
        add(fullNameField);

        // Create the register button without an action listener initially
        JButton registerButton = new JButton("Register");
        add(registerButton);
    }

    // Method to set the action listener for the register button
    public void setRegisterAction(ActionListener actionListener) {
        JButton registerButton = (JButton) getComponent(10); // Index where the button is added
        registerButton.addActionListener(actionListener);
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public String getEmail() {
        return emailField.getText();
    }

    public String getFullName() {
        return fullNameField.getText();
    }

    public void clearFields() {
        usernameField.setText("");
        passwordField.setText("");
        emailField.setText("");
        fullNameField.setText("");
    }
}
