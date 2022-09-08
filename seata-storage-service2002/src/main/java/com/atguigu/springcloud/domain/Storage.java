package com.atguigu.springcloud.domain;

import lombok.Data;

/**
 * @author jian
 * @describe
 * @create 2022-09-07 17:46
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;

}
