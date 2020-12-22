package com.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 商品实体类
 *
 * @author example
 * @since 2020-12-22 20:38:07
 */
public class Items implements Serializable {
    private static final long serialVersionUID = 262562090146016708L;
    
    private Integer id;
    /**
    * 商品名称
    */
    private String name;
    /**
    * 商品定价
    */
    private Double price;
    /**
    * 商品描述
    */
    private String detail;
    /**
    * 商品图片
    */
    private String pic;
    /**
    * 生产日期
    */
    private Date createtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}