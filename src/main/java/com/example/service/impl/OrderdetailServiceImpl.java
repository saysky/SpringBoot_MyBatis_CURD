package com.example.service.impl;


import com.example.entity.Orderdetail;
import com.example.dao.OrderdetailDao;
import com.example.service.OrderdetailService;
import com.example.dao.OrderdetailDao;
import com.example.service.OrderdetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单明细表服务实现类
 *
 * @author example
 * @since 2020-12-22 20:38:07
 */
@Service("orderdetailService")
public class OrderdetailServiceImpl implements OrderdetailService {
    @Resource
    private OrderdetailDao orderdetailDao;


    @Override
    public List<Orderdetail> findByOrdersId(Integer ordersId) {
        return this.orderdetailDao.findByOrdersId(ordersId);
    }
}