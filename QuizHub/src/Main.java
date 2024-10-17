import controller.AuthController;
import view.QuizFrame;
import javax.swing.JOptionPane;
import view.Auth.LoginFrame;

public class Main {
    public static void main(String[] args) {
        LoginFrame frame = new LoginFrame();
            frame.setVisible(true);
        
        // Create the AuthController to manage authentication
//        AuthController authController = new AuthController();
//
//        // Show the login panel
//        boolean loginSuccessful = authController.showLogin(); // Assume showLogin returns true on success
//
//        if (loginSuccessful) {
//            // On successful login, show the main application frame
//            QuizFrame frame = new QuizFrame();
//            frame.setVisible(true); // Show the quiz frame
//        } else {
//            // Handle failed login
//            JOptionPane.showMessageDialog(null, "Login failed. Please try again.", "Login Error", JOptionPane.ERROR_MESSAGE);
//        }
    }
}