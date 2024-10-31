package repositories;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.User;
import java.sql.ResultSet;
import org.mindrot.jbcrypt.BCrypt;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AuthRepository {
    private static final Logger logger = Logger.getLogger(AuthRepository.class.getName());
    
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
            logger.log(Level.SEVERE, "Database error occurred during user registration", e);
        }
        return false;
    }

    public boolean isUserExists(String userName) {

        String sql = "SELECT COUNT(1) FROM Users (NOLOCK) WHERE UserName = ?";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, userName);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0; // Trả về true nếu số lượng lớn hơn 0
                }
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Database error occurred", e);logger.log(Level.SEVERE, "Database error occurred during user existence check", e);
        }
        return false;
    }

    public String getHashedPassword(String username) {
        String hashedPassword = null;

        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT password FROM users (NOLOCK) WHERE username = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, username);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                hashedPassword = resultSet.getString("password");
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Database error occurred while fetching hashed password", e);
        }
        return hashedPassword;
    }
}
