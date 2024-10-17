package repositories;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.User;
import java.sql.ResultSet;

public class AuthRepository {

    public boolean registerUser(User user) {
        String sql = "INSERT INTO Users (UserName, Password, Email, FullName) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(1, user.getEmail());
            pstmt.setString(2, user.getFullName());

            return pstmt.executeUpdate() > 0; // Return true if a row was inserted
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public User login(String username, String password) {
        String sql = "SELECT * FROM User WHERE UserName = ? AND Password = ?";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("Id"));
                user.setUserName(rs.getString("UserName"));
                user.setEmail(rs.getString("Email"));
                user.setFullName(rs.getString("FullName"));
                user.setRole(rs.getString("Role"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // User not found
    }

}
