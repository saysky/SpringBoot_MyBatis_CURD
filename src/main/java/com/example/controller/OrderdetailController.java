package com.example.controller;



import com.example.entity.Orderdetail;
import com.example.service.OrderdetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单明细表控制层
 *
 * @author example
 * @since 2020-12-22 20:38:07
 */
@RestController
@RequestMapping("/orderdetail")
public class OrderdetailController {
    /**
     * 服务对象
     */
    @Resource
    private OrderdetailService orderdetailService;

    /**
     * 通过订单ID查询订单明细
     * 访问 http://localhost:8080/orderdetail/findByOrdersId?ordersId=3
     *
     * @param ordersId 订单ID
     * @return 单条数据
     */
    @GetMapping("/findByOrdersId")
    public List<Orderdetail> findByOrdersId(@RequestParam("ordersId") Integer ordersId) {
        return this.orderdetailService.findByOrdersId(ordersId);
    }

}