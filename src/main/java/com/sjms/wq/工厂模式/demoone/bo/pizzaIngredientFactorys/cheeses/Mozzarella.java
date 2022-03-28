package com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.cheeses;

/**
 * @Author: 世墨
 * @Date: 2022/3/15 17:11
 * @DESCRIPTION 无盐奶酪
 */
public class Mozzarella extends Cheese {
    @Override
    public void out() {
        System.out.println("无盐奶酪安装！！");
    }
}
