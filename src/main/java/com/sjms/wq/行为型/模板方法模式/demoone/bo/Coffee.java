package com.sjms.wq.行为型.模板方法模式.demoone.bo;

/**
 * @Author: 世墨
 * @Date: 2022/4/16 15:04
 * @DESCRIPTION 星巴滋咖啡冲泡法
 */
public class Coffee extends CaffeineBeverage {
    @Override
    protected void addACondiments() {
        System.out.println("加糖和牛奶");
    }

    @Override
    protected void brew() {
        System.out.println("把沸水冲泡咖啡");
    }

//    public void prepareRecipe(){
//        boilWater();
//        brewCoffeeGrinds();
//        pourIncup();
//        addASugarAndMilk();
//    }
//
//    private void addASugarAndMilk() {
//        System.out.println("加糖和牛奶");
//    }
//
//    private void pourIncup() {
//        System.out.println("把咖啡倒进杯子");
//    }
//
//    private void brewCoffeeGrinds() {
//        System.out.println("把沸水冲泡咖啡");
//    }
//
//    private void boilWater() {
//        System.out.println("把水煮沸");
//    }
}
