package com.group4.bookstoreback.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.group4.bookstoreback.entity.GoodsInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper extends BaseMapper<GoodsInfo> {

    List<GoodsInfo> queryAllGoods();
    List<GoodsInfo> queryGoodsByCategoryId(Integer id);

}
