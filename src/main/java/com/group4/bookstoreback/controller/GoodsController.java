package com.group4.bookstoreback.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.group4.bookstoreback.entity.Category;
import com.group4.bookstoreback.entity.GoodsInfo;
import com.group4.bookstoreback.service.GoodsService;
import com.group4.bookstoreback.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/all")
    public JsonResult getAll(){
        return JsonResult.isOk(goodsService.queryAllGoods());
    }
    @RequestMapping("/queryGood")
    public JsonResult queryGoodsById(@RequestBody GoodsInfo goodsInfo) {
        return JsonResult.isOk(goodsService.getById(goodsInfo.getId()));
    }
    @RequestMapping("/queryGoodsByCategory")
    public JsonResult queryGoodsByCategory(@RequestBody Category category){
        return JsonResult.isOk(goodsService.queryGoodsByCategoryId(category.getId()));
    }
    @GetMapping("/page")
    public Page<GoodsInfo> findPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        return goodsService.page(new Page<>(pageNum, pageSize));
    }







}
