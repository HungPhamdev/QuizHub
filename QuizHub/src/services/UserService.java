package services;

import java.util.List;
import model.User;
import repositories.UserRepository;

public class UserService {

    private UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    public int createUser(User user) {
        return userRepository.createUser(user);
    }

    public int updateUser(User user) {
        return userRepository.updateUser(user);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public int deleteUser(String username) {
        return userRepository.deleteUser(username);
    }
}
