package com.group4.bookstoreback.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.group4.bookstoreback.entity.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {
    List<ShoppingCart> queryCartListByUserId(Integer userId);
}
