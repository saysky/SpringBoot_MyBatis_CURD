package com.example.service;


import com.example.entity.Orderdetail;

import java.util.List;

/**
 * 订单明细表服务接口
 *
 * @author example
 * @since 2020-12-22 20:38:07
 */
public interface OrderdetailService {



    /**
     * 根据订单ID查询订单明细
     *
     * @param ordersId
     * @return 订单明细列表
     * @author example
     */
    List<Orderdetail> findByOrdersId(Integer ordersId);
}