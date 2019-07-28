package com.moozhy.repository;

import com.moozhy.model.OrderMaster;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 陆逊
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);

    List<OrderMaster> findByBuyerOpenidAndOrderStatus(String buyerOpenid, Integer orderStatus);
}
