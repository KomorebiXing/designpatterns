package com.sjms.wq.结构型.装饰对象模式.demoone.bo;

/**
 * @Author: 世墨
 * @Date: 2022/3/6 17:17
 * @DESCRIPTION 综合咖啡
 */
public class HouserBlend extends Beverage{

    public HouserBlend() {
        super.setDescription("HouserBlend");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
