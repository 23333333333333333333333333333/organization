package com.mengyunzhi.organization.controller;

import com.mengyunzhi.organization.entity.User;
import com.mengyunzhi.organization.service.LoginServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.Console;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginServce loginServce;
    @PostMapping("/")
    public User login(@RequestBody User user, HttpSession session) {
        User loginUser = loginServce.login(user.getUsername(), user.getPassword());

        if (loginUser != null) {
            session.setAttribute(user.getUsername(), user);
            return loginUser;
        } else {
            return null;
        }
    }
}
