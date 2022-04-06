package com.group4.bookstoreback.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.group4.bookstoreback.entity.Category;

import java.util.List;

public interface CategoryService extends IService<Category> {
    List<Category> queryAllCategory();
}
