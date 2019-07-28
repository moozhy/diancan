package com.moozhy.repository;

import com.moozhy.model.SellerInfo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 陆逊
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, Integer> {
    SellerInfo findByPhone(String phone);

    SellerInfo findBySellerId(Integer sellerId);
}
