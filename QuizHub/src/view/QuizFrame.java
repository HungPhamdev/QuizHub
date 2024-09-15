package view;

import javax.swing.*;
import java.awt.*;

public class QuizFrame extends JFrame {
    private QuestionPanel questionPanel;
    private ResultPanel resultPanel;

    public QuizFrame() {
        setTitle("Quiz Application");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        questionPanel = new QuestionPanel();
        resultPanel = new ResultPanel();

        add(questionPanel, BorderLayout.CENTER);
        add(resultPanel, BorderLayout.SOUTH);
    }

    public QuestionPanel getQuestionPanel() {
        return questionPanel;
    }

    public ResultPanel getResultPanel() {
        return resultPanel;
    }
}