package com.wj.wjnew;

import com.wj.wjnew.bag.Bag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Title: ShoppingCart
 * @Description:购物车
 * @Author: Administrator
 * @Date: 2024/2/20 18:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCart {
    private List<Bag> allBag = new ArrayList<Bag>();

    public BigDecimal getAllPrice(){//求和
        BigDecimal allPrice = new BigDecimal(0);
        for (Bag bag:allBag){
            allPrice=allPrice.add(bag.Calculate());
        }
        return allPrice;
    }

    public void addBag(Bag bag){
        allBag.add(bag);
    }
}
