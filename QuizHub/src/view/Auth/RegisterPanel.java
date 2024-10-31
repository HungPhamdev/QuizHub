package view.Auth;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.User;
import services.AuthService;
import view.MainFrame;

public class RegisterPanel extends javax.swing.JPanel {

    private final MainFrame mainFrame;
    private final AuthService authService;

    public RegisterPanel(MainFrame frame) {
        this.mainFrame = frame;
        this.authService = new AuthService();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblQuizApp = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        mainRegisterPanel = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        lblFullname = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        userNameField = new javax.swing.JTextField();
        fullnameField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(497, 356));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblQuizApp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblQuizApp.setForeground(new java.awt.Color(255, 255, 255));
        lblQuizApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuizApp.setText("Quiz Application");
        lblQuizApp.setToolTipText("");
        jPanel2.add(lblQuizApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 190, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 120));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainRegisterPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainRegisterPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true), "LOGIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 18), new java.awt.Color(0, 153, 153))); // NOI18N
        mainRegisterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUserName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 153, 153));
        lblUserName.setText("Username:");
        mainRegisterPanel.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lblPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 153, 153));
        lblPassword.setText("Password:");
        mainRegisterPanel.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        emailField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        emailField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        mainRegisterPanel.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 330, 40));

        passwordField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        passwordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        mainRegisterPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 330, 40));

        lblFullname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblFullname.setForeground(new java.awt.Color(0, 153, 153));
        lblFullname.setText("Fullname:");
        mainRegisterPanel.add(lblFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        lblEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 153, 153));
        lblEmail.setText("Email:");
        mainRegisterPanel.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        saveButton.setBackground(new java.awt.Color(0, 153, 153));
        saveButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        mainRegisterPanel.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 170, 40));

        userNameField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        userNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        mainRegisterPanel.add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 330, 40));

        fullnameField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        fullnameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        mainRegisterPanel.add(fullnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 330, 40));

        jPanel5.add(mainRegisterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 488, 350));
        mainRegisterPanel.getAccessibleContext().setAccessibleName("REGISTER"); // NOI18N

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 500, 360));
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String username = userNameField.getText();
        String password = new String(passwordField.getPassword());
        String fullname = fullnameField.getText();
        String email = emailField.getText();

        if (username.trim().isEmpty()) {
            showErrorMessage("Username is required!");
            return;
        }
        else if (password.trim().isEmpty()) {
            showErrorMessage("Password is required!");
            return;
        }
        else if (fullname.trim().isEmpty()) {
            showErrorMessage("Fullname is required!");
            return;
        }
        else if (email.trim().isEmpty()) {
            showErrorMessage("Email is required!");
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
        
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        user.setFullName(fullname);
        user.setEmail(email);
        
        boolean result = this.authService.registerUser(user);

        if (result) {
            JOptionPane.showMessageDialog(this, "Registration successful!");
            mainFrame.showLoginPanel();
        } else {
            showErrorMessage("Registration failed.");
        }
    }//GEN-LAST:event_saveButtonActionPerformed
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }
    
    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Input Error", JOptionPane.ERROR_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField fullnameField;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblQuizApp;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel mainRegisterPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
