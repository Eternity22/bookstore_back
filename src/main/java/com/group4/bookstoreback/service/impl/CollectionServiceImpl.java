package com.group4.bookstoreback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group4.bookstoreback.entity.CollectionInfo;
import com.group4.bookstoreback.entity.OrderInfo;
import com.group4.bookstoreback.mapper.CollectionMapper;
import com.group4.bookstoreback.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CollectionServiceImpl extends ServiceImpl<CollectionMapper, CollectionInfo> implements CollectionService {

    @Autowired
    private CollectionMapper collectionMapper;
    @Override
    public List<CollectionInfo> queryCollectionByUserId(Integer userId) {
        return collectionMapper.queryCollectionByUserId(userId);
    }

    @Override
    public int deleteCollectionByCollectionId(Integer id) {
        return collectionMapper.deleteById(id);
    }

    @Override
    public int addCollection(CollectionInfo collectionInfo) {
        return collectionMapper.insert(collectionInfo);
    }

    @Override
    public CollectionInfo queryByUserIdAndGoodsId(CollectionInfo collectionInfo) {
        Map<String, Object> queryParamsMap = new HashMap<>();
        queryParamsMap.put("user_id", collectionInfo.getUserId());
        queryParamsMap.put("goods_id", collectionInfo.getGoodsId());
        QueryWrapper<CollectionInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.allEq(queryParamsMap);
        return collectionMapper.queryByUserIdAndGoodsId(collectionInfo);
    }
}
