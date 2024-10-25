package services;

import model.User;
import repositories.AuthRepository;
import org.mindrot.jbcrypt.BCrypt;

public class AuthService {

    private final AuthRepository authRepository;

    public AuthService() {
        this.authRepository = new AuthRepository();
    }

    public boolean registerUser(User user) {
        return authRepository.registerUser(user);
    }

    public boolean isUserExists(String userName, String email){
        return authRepository.isUserExists(userName, email);
    }
    
    public boolean login(String username, String password) {
        String hashedPassword = authRepository.getHashedPassword(username);
        if (hashedPassword != null) {
            return BCrypt.checkpw(password, hashedPassword); // Verify password
        }
        return false; // Username not found
    }
}
