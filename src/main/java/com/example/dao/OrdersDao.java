package com.example.dao;


import com.example.entity.Orders;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 订单表数据库访问层
 *
 * @author example
 * @since 2020-12-22 20:38:07
 */
@Mapper
public interface OrdersDao {


    /**
     * 根据用户ID查询定点杆
     *
     * @param userId
     * @return
     * @author example
     */
    List<Orders> findByUserId(Integer userId);
}