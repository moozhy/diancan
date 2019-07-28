package com.moozhy.service;

import com.moozhy.model.SellerInfo;

/**
 * 卖家端
 * @author 陆逊
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @return
     */
    SellerInfo findSellerInfoByPhone(String phone);
}
