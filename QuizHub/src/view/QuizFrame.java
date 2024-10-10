package view;

import javax.swing.*;
import java.awt.*;
import view.User.UserManagementPanel;

public class QuizFrame extends JFrame {
    private QuestionPanel questionPanel;
    private ResultPanel resultPanel;
    private JTabbedPane tabbedPane;

    public QuizFrame() {
        setTitle("Quiz Application");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a tabbed pane
        tabbedPane = new JTabbedPane();

        // Add QuestionPanel and ResultPanel
        QuestionPanel questionPanel = new QuestionPanel();
        ResultPanel resultPanel = new ResultPanel();
        tabbedPane.addTab("Quiz", questionPanel);
        tabbedPane.addTab("Results", resultPanel);

        // Add UserManagementPanel
        UserManagementPanel userManagementPanel = new UserManagementPanel();
        tabbedPane.addTab("User Management", userManagementPanel);

        // Add tabbed pane to the frame
        add(tabbedPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(QuizFrame::new);
    }
    
    public QuestionPanel getQuestionPanel() {
        return questionPanel;
    }

    public ResultPanel getResultPanel() {
        return resultPanel;
    }
}