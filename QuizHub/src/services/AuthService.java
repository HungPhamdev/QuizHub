package services;

import model.User;
import repositories.AuthRepository;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt;
import repositories.UserRepository;

public class AuthService {

    private AuthRepository authRepository;
    private UserRepository userRepository;

    public AuthService() {
        this.authRepository = new AuthRepository();
        this.userRepository = new UserRepository();
    }
    
    public boolean registerUser(User user) {        
        return authRepository.registerUser(user);
    }

    public User login(String username, String password) {
        try {
            User user = userRepository.findUserByUsername(username);
            if (user != null && BCrypt.checkpw(password, user.getPassword())) { // Remember to compare hashed passwords
                return user; // Successful login
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // Invalid credentials
    }
}
