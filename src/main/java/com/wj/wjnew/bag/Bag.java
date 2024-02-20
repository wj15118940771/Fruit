package com.wj.wjnew.bag;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Title: Bag
 * @Description:袋子
 * @Author: Administrator
 * @Date: 2024/2/20 18:24
 */
@AllArgsConstructor
@Data
public class Bag implements CalculateAmount {
    public BigDecimal Calculate() {
        return new BigDecimal(0);
    }

}
