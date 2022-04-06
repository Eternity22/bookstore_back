package com.group4.bookstoreback.service;

import com.alipay.api.AlipayApiException;
import com.group4.bookstoreback.entity.AlipayBean;



public interface PayService {

    /**
     * 支付宝支付接口
     * @param alipayBean
     * @return
     * @throws AlipayApiException
     */
    String aliPay(AlipayBean alipayBean) throws AlipayApiException;

}
