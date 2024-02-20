package com.wj.wjnew.promotion;

import com.wj.wjnew.ShoppingCart;

import java.math.BigDecimal;

/**
 * @Title: Promotion
 * @Description:
 * @Author: Administrator
 * @Date: 2024/2/20 19:12
 */
public class Promotion implements PromotionInterface{
    public BigDecimal getEndPrice(ShoppingCart shoppingCart) {
        return shoppingCart.getAllPrice();
    }
}
