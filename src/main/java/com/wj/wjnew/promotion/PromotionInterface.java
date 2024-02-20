package com.wj.wjnew.promotion;

import com.wj.wjnew.ShoppingCart;

import java.math.BigDecimal;

/**
 * @Title: PromotionInterface
 * @Description:
 * @Author: Administrator
 * @Date: 2024/2/20 19:01
 */
public interface PromotionInterface {
    BigDecimal getEndPrice(ShoppingCart shoppingCart);
}
