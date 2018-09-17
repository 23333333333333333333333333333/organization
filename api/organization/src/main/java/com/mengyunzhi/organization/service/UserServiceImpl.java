package com.mengyunzhi.organization.service;

import com.mengyunzhi.organization.entity.User;
import com.mengyunzhi.organization.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Consumer;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public User getByName(String name) {
        List<User> users = (List<User>) userRepository.findAll();
        for (User user : users) {
            if (user.getUsername().equals(name)) {
                return user;
            }
        }
        return null;
    }
}
