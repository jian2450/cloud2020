package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author jian
 * @describe
 * @create 2022-08-23 22:45
 */
@RestController
@Slf4j
public class OrderZKController {

    public static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "consumer/payment/zk")
    public String paymentInfo() {

        String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
        log.info("消费者调用支付服务(zookeeper)--->result:" + result);
        return result;
    }

}
