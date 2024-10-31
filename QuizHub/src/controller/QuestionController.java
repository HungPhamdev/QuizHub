package controller;

import java.util.List;
import model.Question;
import services.QuestionService;


public class QuestionController {
    private QuestionService questionService;

    public QuestionController() {
        this.questionService = new QuestionService();
    }

    public int addQuestion(Question question) {
        return questionService.createQuestion(question);
    }

    public int modifyQuestion(Question question) {
        return questionService.updateQuestion(question);
    }

    public List<Question> listQuestions() {
        return questionService.getAllQuestions();
    }

    public int removeQuestion(int questionId) {
        return questionService.deleteQuestion(questionId);
    }
    
    public boolean isTitleExists(String title){
        return questionService.isTitleExists(title);
    }
    
    public String findTitleById(int id){
        return questionService.findTitleById(id);
    }
}
