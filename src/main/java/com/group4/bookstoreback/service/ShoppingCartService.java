package com.group4.bookstoreback.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.group4.bookstoreback.entity.ShoppingCart;
import com.group4.bookstoreback.entity.UserInfo;

import java.util.List;


public interface ShoppingCartService extends IService<ShoppingCart> {

    List<ShoppingCart> queryCartListByUserId(Integer userId);
    int addGood(ShoppingCart shoppingCart);
    int deleteByCartId(ShoppingCart shoppingCart);
    int updateByCartId(ShoppingCart shoppingCart);
    int deleteByBatchCartIds(List<Integer> cartIdList);

}
