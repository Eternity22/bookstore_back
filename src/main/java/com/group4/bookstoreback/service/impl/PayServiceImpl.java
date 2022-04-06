package com.group4.bookstoreback.service.impl;


import com.group4.bookstoreback.entity.AlipayBean;
import com.group4.bookstoreback.service.PayService;
import com.group4.bookstoreback.utils.Alipay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alipay.api.AlipayApiException;

@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private Alipay alipay;


    @Override
    public String aliPay(AlipayBean alipayBean) throws AlipayApiException {
        return alipay.pay(alipayBean);
    }
}
