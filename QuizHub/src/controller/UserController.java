package controller;

import java.util.List;
import model.User;
import services.UserService;

public class UserController {
    private UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public int addUser(User user) {
        return userService.createUser(user);
    }

    public int modifyUser(User user) {
        return userService.updateUser(user);
    }

    public List<User> listUsers() {
        return userService.getAllUsers();
    }

    public int removeUser(String username) {
        return userService.deleteUser(username);
    }
}