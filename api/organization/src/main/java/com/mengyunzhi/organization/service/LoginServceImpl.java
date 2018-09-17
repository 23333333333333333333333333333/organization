package com.mengyunzhi.organization.service;

import com.mengyunzhi.organization.entity.User;
import com.mengyunzhi.organization.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServceImpl implements LoginServce {
    @Autowired UserService userService;
    @Override
    public User login(String name, String password) {
        User user = userService.getByName(name);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
