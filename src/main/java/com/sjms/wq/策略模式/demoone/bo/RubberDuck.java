package com.sjms.wq.策略模式.demoone.bo;

import com.sjms.wq.策略模式.demoone.interfaces.iml.FlyNoWay;
import com.sjms.wq.策略模式.demoone.interfaces.iml.MuteQuck;

/**
 * @Author: 世墨
 * @Date: 2022/2/16 10:46
 * @DESCRIPTION 橡皮鸭子
 */
public class RubberDuck extends Duck {
    //第三次添加
    public RubberDuck(){
        super.quackBehavior = new MuteQuck();
        super.flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("我是橡皮鸭子");
    }
}
