package com.wj.wjnew.promotion;

import com.wj.wjnew.ShoppingCart;

import java.math.BigDecimal;

/**
 * @Title: Promotion1
 * @Description:满100减10元促销
 * @Author: Administrator
 * @Date: 2024/2/20 19:02
 */
public class Promotion1 extends Promotion {
    public BigDecimal getEndPrice(ShoppingCart shoppingCart) {
        Integer number =shoppingCart.getAllPrice().divide(new BigDecimal(100)).intValue();
        BigDecimal subPrice = new BigDecimal(number*10);
        return shoppingCart.getAllPrice().subtract(subPrice);
    }
}
