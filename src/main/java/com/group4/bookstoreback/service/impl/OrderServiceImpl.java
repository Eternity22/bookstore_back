package com.group4.bookstoreback.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group4.bookstoreback.entity.OrderInfo;
import com.group4.bookstoreback.entity.ShoppingCart;
import com.group4.bookstoreback.mapper.OrderMapper;
import com.group4.bookstoreback.mapper.ShoppingCartMapper;
import com.group4.bookstoreback.service.OrderService;
import com.group4.bookstoreback.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderInfo> implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Override
    public int addOrder(OrderInfo orderInfo) {
        return orderMapper.insert(orderInfo);
    }

    @Override
    public List<OrderInfo> queryOrderListByUserId(Integer userId) {

        return orderMapper.queryOrderListByUserId(userId);
    }

    @Override
    public int cancelOrderByOrderId(OrderInfo orderInfo) {
        UpdateWrapper<OrderInfo> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id",orderInfo.getId()).set("status", 0);
        return orderMapper.update(orderInfo,updateWrapper);
    }

    @Override
    public OrderInfo queryOrderDetailByOrderId(Integer id) {
        return orderMapper.queryOrderDetailByOrderId(id);
    }
}
