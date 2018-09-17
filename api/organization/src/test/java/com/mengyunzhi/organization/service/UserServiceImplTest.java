package com.mengyunzhi.organization.service;

import com.mengyunzhi.organization.entity.User;
import com.mengyunzhi.organization.repository.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.*;

public class UserServiceImplTest extends ServiceTest{
    @Autowired
    UserRepository userRepository;
    @Autowired UserService userService;

    @Test
    public void getByNameTest(){
        String name = "zhansan111";
        User user = new User();
        user.setUsername(name);
        userRepository.save(user);
        User getUser = userService.getByName(name);
        assertThat(getUser.getUsername()).isEqualTo(name);
    }
}