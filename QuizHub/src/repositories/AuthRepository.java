package repositories;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.User;
import java.sql.ResultSet;
import org.mindrot.jbcrypt.BCrypt;

public class AuthRepository {

    public boolean registerUser(User user) {
        String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());

        String sql = "INSERT INTO Users (UserName, Password, Email, FullName) VALUES (?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, hashedPassword);
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getFullName());

            return pstmt.executeUpdate() > 0; // Return true if a row was inserted
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String getHashedPassword(String username) {
        String hashedPassword = null;

        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT password FROM users WHERE username = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, username);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                hashedPassword = resultSet.getString("password");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hashedPassword;
    }
}
