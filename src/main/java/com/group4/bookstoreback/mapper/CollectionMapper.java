package com.group4.bookstoreback.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.group4.bookstoreback.entity.CollectionInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollectionMapper extends BaseMapper<CollectionInfo> {

    List<CollectionInfo> queryCollectionByUserId(Integer userId);
    CollectionInfo queryByUserIdAndGoodsId(CollectionInfo collectionInfo);
}
