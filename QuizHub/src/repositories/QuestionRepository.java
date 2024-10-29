package repositories;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Question;

public class QuestionRepository {

    public int createQuestion(Question question) {
        String sql = "INSERT INTO Questions (Title, QuestionType, QuizId, CreatedAt) VALUES (?, ?, ?, GETDATE())";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, question.getTitle());
            preparedStatement.setString(2, question.getQuestionType());
            preparedStatement.setInt(3, question.getQuizId());

            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int updateQuestion(Question question) {
        String sql = "UPDATE Questions SET Title = ?, QuestionType = ?, QuizId = ?, UpdatedAt = GETDATE() WHERE QuestionId = ?";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, question.getTitle());
            preparedStatement.setString(2, question.getQuestionType());
            preparedStatement.setInt(3, question.getQuizId());
            preparedStatement.setInt(4, question.getQuestionId());

            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<Question> getAllQuestions() {
        List<Question> questions = new ArrayList<>();
        String sql = "SELECT * FROM Questions (NOLOCK) WHERE isDeleted = 0";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql); ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Question question = new Question();
                question.setQuestionId(resultSet.getInt("Id"));
                question.setTitle(resultSet.getString("QuestionName"));
                question.setQuestionType(resultSet.getString("QuestionType"));
                question.setQuizId(resultSet.getInt("QuizId"));
                questions.add(question);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return questions;
    }

    public int deleteQuestion(int questionId) {
        String sql = "UPDATE Questions SET isDeleted = 1 WHERE QuestionId = ?";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, questionId);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public boolean isTitleExists(String title) {
        String sql = "SELECT 1 FROM Questions (NOLOCK) WHERE IsDeleted = 0 AND Title = ?";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, title);
            try (ResultSet rs = preparedStatement.executeQuery()) {
                if (rs.next()) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
