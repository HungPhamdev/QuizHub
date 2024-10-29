package services;

import java.util.List;
import model.Question;
import repositories.QuestionRepository;

public class QuestionService {

    private QuestionRepository questionRepository;

    public QuestionService() {
        this.questionRepository = new QuestionRepository();
    }

    public int createQuestion(Question question) {
        return questionRepository.createQuestion(question);
    }

    public int updateQuestion(Question question) {
        return questionRepository.updateQuestion(question);
    }

    public List<Question> getAllQuestions() {
        return questionRepository.getAllQuestions();
    }

    public int deleteQuestion(int questionId) {
        return questionRepository.deleteQuestion(questionId);
    }
}
