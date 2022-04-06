package com.group4.bookstoreback.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group4.bookstoreback.entity.Category;
import com.group4.bookstoreback.entity.GoodsInfo;
import com.group4.bookstoreback.mapper.CategoryMapper;
import com.group4.bookstoreback.mapper.GoodsMapper;
import com.group4.bookstoreback.service.CategoryService;
import com.group4.bookstoreback.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> queryAllCategory() {
        return categoryMapper.queryAllCategory();
    }
}
