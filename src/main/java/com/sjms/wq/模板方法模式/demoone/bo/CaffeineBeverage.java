package com.sjms.wq.模板方法模式.demoone.bo;

/**
 * @Author: 世墨
 * @Date: 2022/4/16 15:32
 * @DESCRIPTION
 */
public abstract class CaffeineBeverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourIncup();
        addACondiments();
    }

    protected abstract void addACondiments();

    protected abstract void brew();

    private void pourIncup() {
        System.out.println("倒进杯子");
    }

    private void boilWater(){
        System.out.println("把水煮沸");
    }

}
