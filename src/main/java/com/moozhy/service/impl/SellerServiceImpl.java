package com.moozhy.service.impl;

import com.moozhy.model.SellerInfo;
import com.moozhy.repository.SellerInfoRepository;
import com.moozhy.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 陆逊
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByPhone(String phone) {
        return repository.findByPhone(phone);
    }
}
