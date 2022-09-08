package com.atguigu.springcloud.service;

/**
 * @author jian
 * @describe
 * @create 2022-09-07 17:55
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);

}
