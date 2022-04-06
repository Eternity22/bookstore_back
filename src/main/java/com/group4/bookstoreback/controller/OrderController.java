package com.group4.bookstoreback.controller;

import com.group4.bookstoreback.entity.OrderInfo;
import com.group4.bookstoreback.service.OrderService;
import com.group4.bookstoreback.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @RequestMapping("/buy")
    public JsonResult addOrder(@RequestBody OrderInfo orderInfo){
        System.out.println(orderInfo);
        orderService.addOrder(orderInfo);
        return JsonResult.isOk(null);
    }

    @RequestMapping("/all")
    public JsonResult getOrderListByUserId(@RequestBody OrderInfo orderInfo){

        System.out.println(orderService.queryOrderListByUserId(orderInfo.getUserId()));
        return JsonResult.isOk(orderService.queryOrderListByUserId(orderInfo.getUserId()));
    }
    @RequestMapping("/cancel")
    public JsonResult cancelOrderByOrderId(@RequestBody OrderInfo orderInfo){
        orderService.cancelOrderByOrderId(orderInfo);
        return JsonResult.isOk(orderService.queryOrderListByUserId(orderInfo.getUserId()));
    }



}
