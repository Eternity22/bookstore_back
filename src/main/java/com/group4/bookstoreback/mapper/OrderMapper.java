package com.group4.bookstoreback.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.group4.bookstoreback.entity.GoodsInfo;
import com.group4.bookstoreback.entity.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<OrderInfo> {
    List<OrderInfo> queryOrderListByUserId(Integer id);
    int cancelOrderByOrderId(Integer id);
    OrderInfo queryOrderDetailByOrderId(Integer id);
}
