package repositories;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Subject;


public class SubjectRepository {
    public int createSubject(Subject subject) {
        String sql = "INSERT INTO Subjects (SubjectName, Description) VALUES (?, ?)";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, subject.getSubjectName());
            preparedStatement.setString(2, subject.getDescription());
            
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int updateSubject(Subject subject) {
        String sql = "UPDATE Subjects SET SubjectName = ?, Description = ? WHERE Id = ?";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, subject.getSubjectName());
            preparedStatement.setString(2, subject.getDescription());
            preparedStatement.setInt(3, subject.getId());
            
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<Subject> getAllSubjects() {
        List<Subject> subjects = new ArrayList<>();
        String sql = "SELECT * FROM Subjects (NOLOCK) WHERE isDeleted = 0";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql); ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Subject subject = new Subject();
                subject.setId(resultSet.getInt("Id"));
                subject.setSubjectName(resultSet.getString("SubjectName"));
                subject.setDescription(resultSet.getString("Description"));
                subjects.add(subject);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return subjects;
    }

    public int deleteSubject(int id) {
        String sql = "UPDATE Subjects SET isDeleted = 1 WHERE Id = ?";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }    
}
