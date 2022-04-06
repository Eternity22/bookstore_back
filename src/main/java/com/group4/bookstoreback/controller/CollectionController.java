package com.group4.bookstoreback.controller;

import com.group4.bookstoreback.entity.CollectionInfo;
import com.group4.bookstoreback.service.CollectionService;
import com.group4.bookstoreback.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.dc.pr.PRError;

@RestController
@RequestMapping("/collection")
public class CollectionController {
    @Autowired
    private CollectionService collectionService;

    @RequestMapping("/all")
    public JsonResult getCollectionList(@RequestBody CollectionInfo collectionInfo){
        return JsonResult.isOk(collectionService.queryCollectionByUserId(collectionInfo.getUserId()));
    }

    @RequestMapping("/delete")
    public JsonResult  deleteCollectionByCollectionId(@RequestBody CollectionInfo collectionInfo){
        return JsonResult.isOk(collectionService.deleteCollectionByCollectionId(collectionInfo.getId()));
    }

    @RequestMapping("/add")
    public JsonResult addCollection(@RequestBody CollectionInfo collectionInfo){
        return JsonResult.isOk(collectionService.addCollection(collectionInfo));
    }

    @RequestMapping("/isExist")
    public JsonResult queryByUserIdAndGoodsId(@RequestBody CollectionInfo collectionInfo){
        return JsonResult.isOk((collectionService.queryByUserIdAndGoodsId(collectionInfo)));
    }

}
