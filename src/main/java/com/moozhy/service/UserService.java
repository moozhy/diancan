package com.moozhy.service;

import com.moozhy.model.User;

/**
 * 用户端
 * @author 陆逊
 */
public interface UserService {

    /**
     * 通过openid查询用户信息
     *
     * @param openid
     * @return
     */
    User findByOpenid(String openid);
}
