package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @author jian
 * @describe
 * @create 2022-09-01 23:53
 */
public class CustomerBlockHandler {

    public static CommonResult handleException1(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler1");
    }

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler2");
    }
}
