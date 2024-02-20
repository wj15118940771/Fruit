package com.wj.wjnew.fruit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Title: Mango
 * @Description:
 * @Author: Administrator
 * @Date: 2024/2/20 16:26
 */
@Data
@AllArgsConstructor
public class Mango extends Fruit{

    public Mango(String name, BigDecimal price, Discount discount) {
        super(name, price, discount);
    }
}
