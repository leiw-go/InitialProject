package top.valley.initialproject.service;

import top.valley.initialproject.bean.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getAllUsers();
}
