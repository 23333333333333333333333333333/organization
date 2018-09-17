package com.mengyunzhi.organization.service;

import com.mengyunzhi.organization.entity.User;

public interface UserService {
    /**
     * 通过用户名来查找用户
     */
    User getByName(String name);
}
