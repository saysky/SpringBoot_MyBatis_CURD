package com.example.service;

import com.example.entity.Items;

import java.util.List;

/**
 * 商品表服务接口
 *
 * @author example
 * @since 2020-12-22 20:38:07
 */
public interface ItemsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     * @author example
     */
    Items queryById(Integer id);

    /**
     * 查询单价大于price的
     *
     * @param price 单价阈值
     * @return 单条数据
     * @author example
     */
    List<Items> findOverPrice(Double price);
}