package com.example.service;


import com.example.entity.Orders;
import java.util.List;

/**
 * 订单表服务接口
 *
 * @author example
 * @since 2020-12-22 20:38:07
 */
public interface OrdersService {

    /**
     * 根据用户ID查询定点杆
     *
     * @param userId
     * @return
     * @author example
     */
    List<Orders> findByUserId(Integer userId);
}