package view;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import view.Auth.LoginPanel;
import view.Auth.RegisterPanel;
import view.Option.OptionManagementPanel;
import view.Question.QuestionManagementPanel;
import view.Quiz.QuizManagementPanel;
import view.Subject.SubjectManagementPanel;
import view.User.UserManagementPanel;

public class MainFrame extends javax.swing.JFrame {

    private CardLayout cardLayout;
    private JPanel mainPanel;
    private LoginPanel loginPanel;
    private HomepagePanel homePanel;
    private RegisterPanel registerPanel;
    private UserManagementPanel userManagementPanel;
    private QuizManagementPanel quizManagementPanel;
    private QuestionManagementPanel questionManagementPanel;
    private OptionManagementPanel optionManagementPanel;
    private SubjectManagementPanel subjectManagementPanel;

    public MainFrame() {
        initComponents();

        cardLayout = new CardLayout();
        setLayout(cardLayout);

        // Initialize panels
        loginPanel = new LoginPanel(this);
        registerPanel = new RegisterPanel(this);
        homePanel = new HomepagePanel(this);
        userManagementPanel = new UserManagementPanel();
        quizManagementPanel = new QuizManagementPanel();
        questionManagementPanel = new QuestionManagementPanel();
        optionManagementPanel = new OptionManagementPanel();
        subjectManagementPanel = new SubjectManagementPanel();

        // Add panels to the frame
        add(loginPanel, "LoginPanel");
        add(homePanel, "HomepagePanel");
        add(registerPanel, "RegisterPanel");
        add(userManagementPanel, "UserManagementPanel");
        add(quizManagementPanel, "QuizManagementPanel");
        add(questionManagementPanel, "QuestionManagementPanel");
        add(optionManagementPanel, "OptionManagementPanel");
        add(subjectManagementPanel, "SubjectManagementPanel");

        // Set initial view
        cardLayout.show(getContentPane(), "LoginPanel");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(getPreferredSize());
        setMinimumSize(getPreferredSize());
        getContentPane().setLayout(new java.awt.CardLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public void showHomePanel() {
        cardLayout.show(getContentPane(), "HomepagePanel"); // Show the Home panel
    }

    public void showRegisterPanel() {
        cardLayout.show(getContentPane(), "RegisterPanel");
    }

    public void showLoginPanel() {
        cardLayout.show(getContentPane(), "LoginPanel");
    }

    public void showUserManagementPanel() {
        cardLayout.show(getContentPane(), "UserManagementPanel");
    }

    public void showQuizManagementPanel() {
        cardLayout.show(getContentPane(), "QuizManagementPanel");
    }

    public void showQuestionManagementPanel() {
        cardLayout.show(getContentPane(), "QuestionManagementPanel");
    }
    
    public void showOptionManagementPanel() {
        cardLayout.show(getContentPane(), "OptionManagementPanel");
    }
    
    public void showSubjectManagementPanel() {
        cardLayout.show(getContentPane(), "SubjectManagementPanel");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
