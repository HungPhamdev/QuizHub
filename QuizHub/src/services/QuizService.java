package services;

import java.util.List;
import model.Quiz;
import repositories.QuizRepository;


public class QuizService {
    private QuizRepository quizRepository;

    public QuizService() {
        this.quizRepository = new QuizRepository();
    }

    public int createQuiz(Quiz Quiz) {
        return quizRepository.createQuiz(Quiz);
    }

    public int updateQuiz(Quiz Quiz) {
        return quizRepository.updateQuiz(Quiz);
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.getAllQuizzes();
    }

    public int deleteQuiz(int quizId) {
        return quizRepository.deleteQuiz(quizId);
    }
    
    public boolean isTitleExists(String title){
        return quizRepository.isTitleExists(title);
    }
}
