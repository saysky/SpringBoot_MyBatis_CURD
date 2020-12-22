package com.example.controller;


import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表控制层
 *
 * @author example
 * @since 2020-12-22 20:38:07
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 根据id查询
     * 访问 http://localhost:8080/user/findById?id=1 进行测试
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/findById")
    @ResponseBody
    public User findById(@RequestParam("id") Integer id) {
        return this.userService.queryById(id);
    }

    /**
     * 根据用户ID集合查询
     * 访问 http://localhost:8080/user/findByIds?ids=1&ids=3&ids=5 进行测试
     *
     * @author example
     *
     * @param ids 主键
     * @return 单条数据
     */
    @GetMapping("/findByIds")
    @ResponseBody
    public List<User> findByIds(@RequestParam("ids") List<Integer> ids) {
        return this.userService.queryByIds(ids);
    }

}