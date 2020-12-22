package com.example.entity;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author example
 * @since 2020-12-22 20:38:07
 */
public class User implements Serializable {
    private static final long serialVersionUID = 793367122288190673L;
    
    private Integer id;
    /**
    * 用户名称
    */
    private String username;
    /**
    * 生日
    */
    private Object birthday;
    /**
    * 性别
    */
    private String sex;
    /**
    * 地址
    */
    private String address;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getBirthday() {
        return birthday;
    }

    public void setBirthday(Object birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}