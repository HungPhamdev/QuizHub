package repositories;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Quiz;

public class QuizRepository {

    public int createQuiz(Quiz Quiz) {
        String sql = "INSERT INTO Quizzes (Title, SubjectId, Level, CreatedAt) VALUES (?, ?, ?, GETDATE())";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, Quiz.getTitle());
            preparedStatement.setInt(2, Quiz.getSubjectId());
            preparedStatement.setString(3, Quiz.getLevel());

            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int updateQuiz(Quiz Quiz) {
        String sql = "UPDATE Quizzes SET Title = ?, SubjectId = ?, Level = ?, UpdatedAt = GETDATE() WHERE QuizId = ?";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, Quiz.getTitle());
            preparedStatement.setInt(2, Quiz.getSubjectId());
            preparedStatement.setString(3, Quiz.getLevel());
            preparedStatement.setInt(4, Quiz.getQuizId());

            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<Quiz> getAllQuizzes() {
        List<Quiz> quizzes = new ArrayList<>();
        String sql = "SELECT * FROM Quizzes (NOLOCK) WHERE isDeleted = 0";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql); ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Quiz quiz = new Quiz();
                quiz.setQuizId(resultSet.getInt("QuizId"));
                quiz.setTitle(resultSet.getString("Title"));
                quiz.setSubjectId(resultSet.getInt("SubjectId"));
                quiz.setLevel(resultSet.getString("Level"));
                quizzes.add(quiz);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return quizzes;
    }

    public int deleteQuiz(int quizId) {
        String sql = "UPDATE Quizzes SET isDeleted = 1 WHERE QuizId = ?";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, quizId);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public boolean isTitleExists(String title) {
        String sql = "SELECT 1 FROM Quizzes (NOLOCK) WHERE IsDeleted = 0 AND Title = ?";
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
