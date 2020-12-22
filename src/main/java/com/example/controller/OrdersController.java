package com.example.controller;


import com.example.entity.Orderdetail;
import com.example.entity.Orders;
import com.example.service.OrderdetailService;
import com.example.service.OrdersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单明细表控制层
 *
 * @author example
 * @since 2020-12-22 20:38:07
 */
@RestController
@RequestMapping("/orders")
public class OrdersController {
    /**
     * 服务对象
     */
    @Resource
    private OrdersService ordersService;

    /**
     * 通过用户ID查询订单列表
     * 访问 http://localhost:8080/orders/findByUserId?userId=1进行测试
     *
     * @param userId 用户ID
     * @return 单条数据
     */
    @GetMapping("/findByUserId")
    public List<Orders> findByUserId(@RequestParam("userId") Integer userId) {
        return this.ordersService.findByUserId(userId);
    }

}