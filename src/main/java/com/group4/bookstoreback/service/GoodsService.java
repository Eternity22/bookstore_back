package com.group4.bookstoreback.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.group4.bookstoreback.entity.GoodsInfo;

import java.util.List;

public interface GoodsService extends IService<GoodsInfo> {
    List<GoodsInfo> queryAllGoods();
    List<GoodsInfo> queryGoodsByCategoryId(Integer id);


}
