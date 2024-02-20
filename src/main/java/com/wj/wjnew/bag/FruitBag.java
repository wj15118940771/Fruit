package com.wj.wjnew.bag;

import com.wj.wjnew.fruit.Fruit;

import java.math.BigDecimal;

/**
 * @Title: FruitBag
 * @Description:袋子
 * @Author: Administrator
 * @Date: 2024/2/20 16:31
 */
public class FruitBag extends Bag implements CalculateAmount {
    private Integer Number=0; //斤数
    private Fruit fruit;

    public BigDecimal Calculate() {
        return BigDecimal.valueOf(Number).multiply(fruit.getPrice().multiply(BigDecimal.valueOf(fruit.getDiscount().timeCalendarDiscount())));//计价：斤数*水果单价*折扣
    }

    public FruitBag(Integer number, Fruit fruit) {
        Number = number;
        this.fruit = fruit;
    }
}
