package com.kujudy.springbootmall.service.impl;

import com.kujudy.springbootmall.dao.UserDao;
import com.kujudy.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
}
