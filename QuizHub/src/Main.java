
import controller.AuthController;
import view.QuizFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import view.MainFrame;

public class Main {

    public static void main(String[] args) {
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
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}
