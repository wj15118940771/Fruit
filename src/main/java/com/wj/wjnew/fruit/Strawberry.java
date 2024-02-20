package com.wj.wjnew.fruit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Title: Strawberry
 * @Description:
 * @Author: Administrator
 * @Date: 2024/2/20 16:25
 */
@Data
@AllArgsConstructor
public class Strawberry extends Fruit{
    public Strawberry(String name, BigDecimal price, Discount discount) {
        super(name, price, discount);
    }
}
