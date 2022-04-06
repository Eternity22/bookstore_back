package com.group4.bookstoreback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group4.bookstoreback.entity.Address;
import com.group4.bookstoreback.entity.OrderInfo;
import com.group4.bookstoreback.entity.ShoppingCart;
import com.group4.bookstoreback.entity.UserInfo;
import com.group4.bookstoreback.mapper.AddressMapper;
import com.group4.bookstoreback.mapper.ShoppingCartMapper;
import com.group4.bookstoreback.service.AddressService;
import com.group4.bookstoreback.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;


    @Override
    public List<ShoppingCart> queryCartListByUserId(Integer userId) {
        return shoppingCartMapper.queryCartListByUserId(userId);
    }

    @Override
    public int addGood(ShoppingCart shoppingCart) {

        return shoppingCartMapper.insert(shoppingCart);
    }

    @Override
    public int deleteByCartId(ShoppingCart shoppingCart) {
        return shoppingCartMapper.deleteById(shoppingCart);
    }

    @Override
    public int updateByCartId(ShoppingCart shoppingCart) {
        return shoppingCartMapper.updateById(shoppingCart);
    }

    @Override
    public int deleteByBatchCartIds(List<Integer> cartIdList) {
        return shoppingCartMapper.deleteBatchIds(cartIdList);
    }


}