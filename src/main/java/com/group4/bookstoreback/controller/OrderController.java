package com.group4.bookstoreback.controller;

import com.alipay.api.AlipayApiException;
import com.group4.bookstoreback.entity.AlipayBean;
import com.group4.bookstoreback.entity.OrderInfo;
import com.group4.bookstoreback.service.OrderService;
import com.group4.bookstoreback.service.PayService;
import com.group4.bookstoreback.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private PayService payService;
    @RequestMapping("/buy")
  //  public JsonResult addOrder(@RequestBody OrderInfo orderInfo) throws AlipayApiException {
    public String addOrder(@RequestBody OrderInfo orderInfo) throws AlipayApiException {
//        System.out.println(orderInfo);
        AlipayBean alipayBean = new AlipayBean();
        UUID uuid = UUID.randomUUID();
        alipayBean.setOut_trade_no(String.valueOf(uuid));
        alipayBean.setSubject(orderInfo.getName());

        alipayBean.setTotal_amount(String.valueOf(orderInfo.getTotalPrice()));
        payService.aliPay(alipayBean);
        System.out.println(alipayBean);
        orderInfo.setName(null);
        orderService.addOrder(orderInfo);

        return payService.aliPay(alipayBean);
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
    @RequestMapping("/queryOrderByOrderId")
    public JsonResult queryOrderDetailByOrderId(@RequestBody OrderInfo orderInfo){
        return JsonResult.isOk(orderService.queryOrderDetailByOrderId(orderInfo.getId()));
    }






}
