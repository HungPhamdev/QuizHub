import controller.QuizController;
import view.QuizFrame;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            QuizFrame frame = new QuizFrame();
            QuizController controller = new QuizController(frame);
            frame.setVisible(true);
        });
    }
}