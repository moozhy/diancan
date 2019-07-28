package com.moozhy.service.impl;

import com.moozhy.model.User;
import com.moozhy.repository.UserRepository;
import com.moozhy.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 陆逊
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
