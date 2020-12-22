package com.example.service;

import com.example.entity.User;

import java.util.List;

/**
 * 用户表服务接口
 *
 * @author example
 * @since 2020-12-22 20:38:07
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     * @author example
     */
    User queryById(Integer id);


    /**
     * 通过ID查询多条数据
     *
     * @param ids 主键集合
     * @return 实例对象
     * @author example
     */
    List<User> queryByIds(List<Integer> ids);

}