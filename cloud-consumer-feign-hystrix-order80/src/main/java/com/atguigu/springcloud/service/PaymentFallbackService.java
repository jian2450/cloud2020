package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author jian
 * @describe
 * @create 2022-08-25 23:45
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fallback paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fallback paymentInfo_TimeOut";
    }
}
