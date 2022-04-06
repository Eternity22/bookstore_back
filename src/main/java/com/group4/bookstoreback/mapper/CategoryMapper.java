package com.group4.bookstoreback.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.group4.bookstoreback.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
    List<Category> queryAllCategory();

}
