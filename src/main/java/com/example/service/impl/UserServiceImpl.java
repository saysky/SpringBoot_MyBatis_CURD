package com.example.service.impl;


import com.example.entity.User;
import com.example.dao.UserDao;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表服务实现类
 *
 * @author example
 * @since 2020-12-22 20:38:07
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     * @author example
     */
    @Override
    public User queryById(Integer id) {
        return this.userDao.queryById(id);
    }


    @Override
    public List<User> queryByIds(List<Integer> ids) {
        return this.userDao.queryByIds(ids);
    }

}