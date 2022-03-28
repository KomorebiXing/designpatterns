package com.sjms.wq.装饰对象模式.demoone.bo;

/**
 * @Author: 世墨
 * @Date: 2022/3/4 10:59
 * @DESCRIPTION  浓缩咖啡
 */
public class Espresso extends Beverage {


    public Espresso() {
        super.setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
