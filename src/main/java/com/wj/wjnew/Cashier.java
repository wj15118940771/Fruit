package com.wj.wjnew;

import com.wj.wjnew.bag.Bag;
import com.wj.wjnew.bag.FruitBag;
import com.wj.wjnew.fruit.*;
import com.wj.wjnew.promotion.Promotion;
import com.wj.wjnew.promotion.Promotion1;

import java.math.BigDecimal;

/**
 * @Title: Cashier
 * @Description:
 * @Author: Administrator
 * @Date: 2024/2/20 16:38
 */
public class Cashier {
    public static void main(String[] args) {
        System.out.println("-----------------------以每份水果10斤计算-----------------------");
        System.out.println("-----------------------题目1-----------------------");
        //设置单价、折扣
        Fruit apple = new Apple("苹果",new BigDecimal(8),new Discount(1,null,null));
        Fruit strawberry = new Strawberry("草莓",new BigDecimal(13),new Discount(1,null,null));
        //模拟购买斤数
        Bag appleFruitBag = new FruitBag(10,apple);
        Bag strawberryFruitBag = new FruitBag(10,strawberry);
        //放入购物车
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addBag(appleFruitBag);
        shoppingCart.addBag(strawberryFruitBag);
        //全场促销
        Promotion promotion = new Promotion();
        System.out.println("-----------------------求和"+promotion.getEndPrice(shoppingCart)+"元-----------------------");

        System.out.println("-----------------------题目2-----------------------");
        //设置单价、折扣
        Fruit mango = new Mango("芒果",new BigDecimal(20),new Discount(1,null,null));
        //模拟购买斤数
        Bag appleFruitBag2 = new FruitBag(10,apple);
        Bag strawberryFruitBag2 = new FruitBag(10,strawberry);
        Bag mangoFruitBag2 = new FruitBag(10,mango);
        //放入购物车
        ShoppingCart shoppingCart2 = new ShoppingCart();
        shoppingCart2.addBag(appleFruitBag2);
        shoppingCart2.addBag(strawberryFruitBag2);
        shoppingCart2.addBag(mangoFruitBag2);
        //全场促销
        System.out.println("-----------------------求和"+promotion.getEndPrice(shoppingCart2)+"元-----------------------");

        System.out.println("-----------------------题目3-----------------------");
        strawberry.getDiscount().setBase(0.8);
        //模拟购买斤数
        Bag appleFruitBag3 = new FruitBag(10,apple);
        Bag strawberryFruitBag3 = new FruitBag(10,strawberry);
        Bag mangoFruitBag3 = new FruitBag(10,mango);
        //放入购物车
        ShoppingCart shoppingCart3 = new ShoppingCart();
        shoppingCart3.addBag(appleFruitBag3);
        shoppingCart3.addBag(strawberryFruitBag3);
        shoppingCart3.addBag(mangoFruitBag3);
        //全场促销
        System.out.println("-----------------------求和"+promotion.getEndPrice(shoppingCart3)+"元-----------------------");

        System.out.println("-----------------------题目4-----------------------");
        //全场促销打折
        Promotion promotion1 = new Promotion1();
        System.out.println("-----------------------求和"+promotion1.getEndPrice(shoppingCart3)+"元-----------------------");
    }
}
