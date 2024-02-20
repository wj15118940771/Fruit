package com.wj.wjnew.fruit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Title: Apple
 * @Description:
 * @Author: Administrator
 * @Date: 2024/2/20 16:22
 */
@Data
@AllArgsConstructor
public class Apple extends Fruit{
    public Apple(String name, BigDecimal price, Discount discount) {
        super(name, price, discount);
    }
}
