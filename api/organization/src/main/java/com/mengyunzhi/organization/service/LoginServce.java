package com.mengyunzhi.organization.service;

import com.mengyunzhi.organization.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public interface LoginServce {

    /**
     * 判断用户登录
     */
    public User login(String name, String password);
}
