package com.example.controller;

import com.example.entity.Items;
import com.example.service.ItemsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品表控制层
 *
 * @author example
 * @since 2020-12-22 20:38:07
 */
@RestController
@RequestMapping("/items")
public class ItemsController {
    /**
     * 服务对象
     */
    @Resource
    private ItemsService itemsService;

    /**
     * 查询单价大于price的
     * 访问 http://localhost:8080/items/findOverPrice?price=3500 进行测试
     *
     * @param price 单价阈值
     * @return 单条数据
     * @author example
     */
    @GetMapping("/findOverPrice")
    public List<Items> findOverPrice(@RequestParam("price") Double price) {
        return this.itemsService.findOverPrice(price);
    }

}