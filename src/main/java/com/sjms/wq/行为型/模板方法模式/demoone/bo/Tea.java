package com.sjms.wq.行为型.模板方法模式.demoone.bo;

/**
 * @Author: 世墨
 * @Date: 2022/4/16 15:08
 * @DESCRIPTION 星巴滋茶冲泡法
 */
public class Tea extends CaffeineBeverage {
    @Override
    protected void addACondiments() {
        System.out.println("加灵梦");
    }

    @Override
    protected void brew() {
        System.out.println("把沸水冲泡茶");
    }

//    public void prepareRecipe(){
//        boilWater();
//        stteepTeaBag();
//        pourIncup();
//        addLemon();
//    }
//
//    private void addLemon() {
//        System.out.println("加灵梦");
//    }
//
//    private void stteepTeaBag() {
//        System.out.println("把沸水冲泡茶");
//    }
//
//    private void boilWater() {
//        System.out.println("把水煮沸");
//    }
//
//    private void pourIncup() {
//        System.out.println("把茶倒进杯子");
//    }
}
