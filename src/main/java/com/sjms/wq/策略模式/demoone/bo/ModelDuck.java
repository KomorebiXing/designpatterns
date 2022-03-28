package com.sjms.wq.策略模式.demoone.bo;

import com.sjms.wq.策略模式.demoone.interfaces.iml.FlyNoWay;
import com.sjms.wq.策略模式.demoone.interfaces.iml.Quck;

/**
 * @Author: 世墨
 * @Date: 2022/2/16 15:10
 * @DESCRIPTION 模板鸭子
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new Quck();
    }

    @Override
    public void display() {
        System.out.println("我是模板鸭子");
    }
}
