package services;

import java.util.List;
import model.User;
import repositories.UserRepository;

public class UserService {

    private UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    public void createUser(User user) {
        userRepository.createUser(user);
    }

    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public void deleteUser(int id) {
        userRepository.deleteUser(id);
    }
}
