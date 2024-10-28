package controller;

import java.util.List;
import model.Quiz;
import services.QuizService;

public class QuizController {

    private QuizService quizService;

    public QuizController() {
        this.quizService = new QuizService();
    }

    public int addQuiz(Quiz Quiz) {
        return quizService.createQuiz(Quiz);
    }

    public int modifyQuiz(Quiz Quiz) {
        return quizService.updateQuiz(Quiz);
    }

    public List<Quiz> listQuizzes() {
        return quizService.getAllQuizzes();
    }

    public int removeQuiz(int id) {
        return quizService.deleteQuiz(id);
    }

    public boolean isTitleExists(String title) {
        return quizService.isTitleExists(title);
    }
}
