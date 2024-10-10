package controller;

import java.util.List;
import model.User;
import services.UserService;

public class UserController {
    private UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public void addUser(User user) {
        userService.createUser(user);
    }

    public void modifyUser(User user) {
        userService.updateUser(user);
    }

    public List<User> listUsers() {
        return userService.getAllUsers();
    }

    public void removeUser(int id) {
        userService.deleteUser(id);
    }
}