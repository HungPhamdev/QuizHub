import controller.QuizController;
import database.DatabaseConnection;
import view.QuizFrame;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {        
        javax.swing.SwingUtilities.invokeLater(() -> {
            QuizFrame frame = new QuizFrame();
            QuizController controller = new QuizController(frame);
            frame.setVisible(true);
        });
    }
}