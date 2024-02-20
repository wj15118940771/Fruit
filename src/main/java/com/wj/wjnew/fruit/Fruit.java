package com.wj.wjnew.fruit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Title: Fruit
 * @Description:
 * @Author: Administrator
 * @Date: 2024/2/20 16:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public  class Fruit {
    private String name;//水果
    private BigDecimal price = BigDecimal.valueOf(0); //价格
    private Discount discount ; //折扣
}
