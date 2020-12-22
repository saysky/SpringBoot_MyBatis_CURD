package com.example.service.impl;


import com.example.dao.OrdersDao;
import com.example.entity.Orders;
import com.example.service.OrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单表服务实现类
 *
 * @author example
 * @since 2020-12-22 20:38:07
 */
@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
    @Resource
    private OrdersDao ordersDao;

    @Override
    public List<Orders> findByUserId(Integer userId) {
        return this.ordersDao.findByUserId(userId);
    }
}