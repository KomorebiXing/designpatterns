package com.sjms.wq.装饰对象模式.demoone.bo;

/**
 * @Author: 世墨
 * @Date: 2022/3/6 17:19
 * @DESCRIPTION
 */
public class Mocha extends CondimentDecorator{

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()  + 0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
