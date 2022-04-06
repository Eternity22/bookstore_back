package com.group4.bookstoreback.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.group4.bookstoreback.entity.OrderInfo;

import java.util.List;

public interface OrderService extends IService<OrderInfo> {
    int addOrder(OrderInfo orderInfo);
    List<OrderInfo> queryOrderListByUserId(Integer userId);
    int cancelOrderByOrderId(OrderInfo orderInfo);

}
