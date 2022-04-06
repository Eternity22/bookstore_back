package com.group4.bookstoreback.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.group4.bookstoreback.entity.CollectionInfo;

import java.util.List;

public interface CollectionService  extends IService<CollectionInfo> {
    List<CollectionInfo> queryCollectionByUserId(Integer userId);
    int deleteCollectionByCollectionId(Integer id);
    int addCollection(CollectionInfo collectionInfo);
    CollectionInfo queryByUserIdAndGoodsId(CollectionInfo collectionInfo);

}
