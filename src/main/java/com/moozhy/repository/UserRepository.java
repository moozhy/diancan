package com.moozhy.repository;

import com.moozhy.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 陆逊
 */
public interface UserRepository extends JpaRepository<User, String> {
    User findByOpenid(String openid);
}
