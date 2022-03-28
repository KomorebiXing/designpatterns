package com.sjms.wq.装饰对象模式.demoone.bo;

/**
 * @Author: 世墨
 * @Date: 2022/3/6 17:26
 * @DESCRIPTION
 */
public class Whip extends CondimentDecorator{
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.29;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",whip";
    }
}
