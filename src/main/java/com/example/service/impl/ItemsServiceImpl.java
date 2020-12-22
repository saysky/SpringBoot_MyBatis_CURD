package com.example.service.impl;

import com.example.entity.Items;
import com.example.dao.ItemsDao;
import com.example.service.ItemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品表服务实现类
 *
 * @author example
 * @since 2020-12-22 20:38:07
 */
@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {
    @Resource
    private ItemsDao itemsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     * @author example
     */
    @Override
    public Items queryById(Integer id) {
        return this.itemsDao.queryById(id);
    }


    @Override
    public List<Items> findOverPrice(Double price) {
        return this.itemsDao.findOverPrice(price);
    }
}