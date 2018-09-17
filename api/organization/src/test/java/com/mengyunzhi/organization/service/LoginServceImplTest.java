package com.mengyunzhi.organization.service;

import com.mengyunzhi.organization.entity.User;
import com.mengyunzhi.organization.repository.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.*;

public class LoginServceImplTest extends ServiceTest{
    @Autowired LoginServce loginServce;
    @Autowired
    UserRepository userRepository;
    @Test
    public void LoginTest() {
        String name = "jdxiang";
        User user = new User();
        user.setUsername(name);
        user.setPassword("123");
        userRepository.save(user);
        User user1 = loginServce.login("jdxiang","123");
        assertThat(user1.getUsername()).isEqualTo("jdxiang");
        User user2 = loginServce.login("jdxiang", "22");
        assertThat(user2).isNull();
    }
}