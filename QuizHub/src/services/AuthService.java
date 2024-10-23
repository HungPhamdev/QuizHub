package services;

import model.User;
import repositories.AuthRepository;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt;
import repositories.UserRepository;

public class AuthService {

    private AuthRepository authRepository;

    public AuthService() {
        this.authRepository = new AuthRepository();
    }

    public boolean registerUser(User user) {
        return authRepository.registerUser(user);
    }

    public boolean login(String username, String password) {
        String hashedPassword = authRepository.getHashedPassword(username);
        if (hashedPassword != null) {
            return BCrypt.checkpw(password, hashedPassword); // Verify password
        }
        return false; // Username not found
    }
}
