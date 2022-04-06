package com.group4.bookstoreback.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group4.bookstoreback.entity.GoodsInfo;
import com.group4.bookstoreback.entity.UserInfo;
import com.group4.bookstoreback.mapper.GoodsMapper;
import com.group4.bookstoreback.mapper.UserMapper;
import com.group4.bookstoreback.service.GoodsService;
import com.group4.bookstoreback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, GoodsInfo> implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public List<GoodsInfo> queryAllGoods() {
        return goodsMapper.queryAllGoods();
    }

    @Override
    public List<GoodsInfo> queryGoodsByCategoryId(Integer id) {
        return goodsMapper.queryGoodsByCategoryId(id);
    }
}
