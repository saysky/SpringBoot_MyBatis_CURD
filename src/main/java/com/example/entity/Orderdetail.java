package com.example.entity;

import java.io.Serializable;

/**
 * 订单明细实体类
 *
 * @author example
 * @since 2020-12-22 20:38:07
 */
public class Orderdetail implements Serializable {
    private static final long serialVersionUID = -48265925445266584L;
    
    private Integer id;
    /**
    * 订单id
    */
    private Integer ordersId;
    /**
    * 商品id
    */
    private Integer itemsId;
    /**
    * 商品购买数量
    */
    private Integer itemsNum;

    /**
     * 订单
     */
    private Orders orders;


    /**
     * 商品
     */
    private Items items;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getItemsId() {
        return itemsId;
    }

    public void setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
    }

    public Integer getItemsNum() {
        return itemsNum;
    }

    public void setItemsNum(Integer itemsNum) {
        this.itemsNum = itemsNum;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }
}