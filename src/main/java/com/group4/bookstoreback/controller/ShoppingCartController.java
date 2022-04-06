package com.group4.bookstoreback.controller;

import com.group4.bookstoreback.entity.ShoppingCart;
import com.group4.bookstoreback.service.ShoppingCartService;
import com.group4.bookstoreback.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartController {


    @Autowired
    HttpServletRequest request;
    @Autowired
    private ShoppingCartService shoppingCartService;
    @RequestMapping("/add")
    public JsonResult addGood(@RequestBody ShoppingCart shoppingCart){
         shoppingCartService.addGood(shoppingCart);
         return JsonResult.isOk(shoppingCartService.queryCartListByUserId(shoppingCart.getUserId()));
    }

    @RequestMapping("/all")
    public JsonResult queryCartByUserId(@RequestBody ShoppingCart shoppingCart){
//        return
//
//        .isOk(shoppingCartService.queryCartListByUserId((Integer) request.getSession().getAttribute("userId")));
        return JsonResult.isOk(shoppingCartService.queryCartListByUserId((Integer) request.getSession().getAttribute("userId")));
    }

    @RequestMapping("/update")
    public JsonResult update(@RequestBody ShoppingCart shoppingCart){
        shoppingCartService.updateByCartId(shoppingCart);
        return JsonResult.isOk(shoppingCartService.queryCartListByUserId(shoppingCart.getUserId()));
    }

    @RequestMapping("/delete")
    public JsonResult delete(@RequestBody ShoppingCart shoppingCart){
        shoppingCartService.deleteByCartId(shoppingCart);
        return JsonResult.isOk(shoppingCartService.queryCartListByUserId(shoppingCart.getUserId()));
    }

    @RequestMapping("/batchDelete")
    public JsonResult batchDelete(@RequestBody List<Integer> cartIdList){
        shoppingCartService.deleteByBatchCartIds(cartIdList);
        return JsonResult.isOk(shoppingCartService.queryCartListByUserId((Integer) request.getSession().getAttribute("userId")));
    }


}
