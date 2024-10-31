package repositories;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Option;

public class OptionRepository {
    public int createOption(Option option) {
        String sql = "INSERT INTO Options (QuestionId, Content, IsCorrect, CreatedAt) VALUES (?, ?, ?, GETDATE())";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, option.getQuestionId());
            preparedStatement.setString(2, option.getContent());
            preparedStatement.setBoolean(3, option.isCorrect());

            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int updateOption(Option option) {
        String sql = "UPDATE Options SET QuestionId = ?, Content = ?, IsCorrect = ?, UpdatedAt = GETDATE() WHERE OptionId = ?";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, option.getQuestionId());
            preparedStatement.setString(2, option.getContent());
            preparedStatement.setBoolean(3, option.isCorrect());
            preparedStatement.setInt(4, option.getOptionId());

            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<Option> getAllOptions() {
        List<Option> options = new ArrayList<>();
        String sql = "SELECT O.OptionId, O.Content, Q.Title QuestionName, O.IsCorrect "
                    + " FROM Options (NOLOCK) O "
                    + " JOIN Questions (NOLOCK) Q ON O.QuestionId = Q.QuestionId "
                    + " WHERE O.isDeleted = 0";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql); ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Option option = new Option();
                option.setOptionId(resultSet.getInt("OptionId"));
                option.setContent(resultSet.getString("Content"));
                option.setQuestionName(resultSet.getString("QuestionName"));
                option.setCorrect(resultSet.getBoolean("IsCorrect"));
                options.add(option);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return options;
    }

    public int deleteOption(int optionId) {
        String sql = "UPDATE Options SET isDeleted = 1 WHERE OptionId = ?";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, optionId);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public boolean isContentExists(String content) {
        String sql = "SELECT 1 FROM Options (NOLOCK) WHERE IsDeleted = 0 AND Content = ?";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, content);
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
    
    public String findContentById(int id) {
        String sql = "SELECT Content FROM Options (NOLOCK) WHERE IsDeleted = 0 AND OptionId = ?";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            try (ResultSet rs = preparedStatement.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("Content");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }
}
