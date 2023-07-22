package top.valley.initialproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.valley.initialproject.bean.User;
import top.valley.initialproject.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    UserService service;

    @GetMapping("getAllUsers")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("addUser")
    public String addUser() {
        User user = new User();
        user.setName("wanglei");
        user.setAge(20);
        service.addUser(user);
        return "ok";
    }
}
