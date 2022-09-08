package com.atguigu.springcloud.service;

import com.atguigu.springcloud.domain.Order;

/**
 * @author jian
 * @describe
 * @create 2022-09-07 0:51
 */
public interface OrderService {

    //创建订单
    void create(Order order);

}
