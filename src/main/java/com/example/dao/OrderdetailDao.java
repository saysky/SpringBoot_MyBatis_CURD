package com.example.dao;


import com.example.entity.Orderdetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 订单明细表数据库访问层
 *
 * @author example
 * @since 2020-12-22 20:38:07
 */
@Mapper
public interface OrderdetailDao {



    /**
     * 根据订单ID查询订单明细
     *
     * @param ordersId
     * @return 订单明细列表
     * @author example
     */
    List<Orderdetail> findByOrdersId(Integer ordersId);

}