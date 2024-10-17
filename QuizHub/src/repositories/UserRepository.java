package repositories;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import database.DatabaseConnection;
import model.User;

public class UserRepository {

    public void createUser(User user) {
        String sql = "INSERT INTO Users (UserName, Password, Email, FullName, Role) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getFullName());
            preparedStatement.setString(5, user.getRole());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        String sql = "UPDATE Users SET UserName = ?, Password = ?, Email = ?, FullName = ?, Role = ? WHERE Id = ?";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getFullName());
            preparedStatement.setString(5, user.getRole());
            preparedStatement.setInt(6, user.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM Users";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql); ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("Id"));
                user.setUserName(resultSet.getString("UserName"));
                user.setPassword(resultSet.getString("Password"));
                user.setEmail(resultSet.getString("Email"));
                user.setFullName(resultSet.getString("FullName"));
                user.setRole(resultSet.getString("Role"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public void deleteUser(int id) {
        String sql = "DELETE FROM Users WHERE Id = ?";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public User findUserByUsername(String userName) throws SQLException {
        String sql = "SELECT * FROM User WHERE UserName = ?";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, userName);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("Id"));
                    user.setUserName(rs.getString("UserName"));
                    user.setPassword(rs.getString("Password")); // Remember: passwords should be hashed
                    user.setEmail(rs.getString("Email"));
                    user.setFullName(rs.getString("FullName"));
                    user.setRole(rs.getString("Role"));
                    return user;
                }
            }
        }
        return null; // User not found
    }
}
