package controller;

import model.Question;
import view.QuizFrame;
import view.QuestionPanel;
import view.ResultPanel;

public class QuizController {
    private QuizFrame frame;
    private Question currentQuestion;

    public QuizController(QuizFrame frame) {
        this.frame = frame;
        // Initialize with the first question
        loadQuestion();
    }

    private void loadQuestion() {
        // Logic to load question from database
        // Update view using frame.getQuestionPanel()
    }

    public void submitAnswer() {
        // Logic to submit answer and update result
        // Update view using frame.getResultPanel()
    }
}