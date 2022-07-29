package com.sjms.wq.行为型.策略模式.demoone.bo;

import com.sjms.wq.行为型.策略模式.demoone.interfaces.iml.FlyWithWings;
import com.sjms.wq.行为型.策略模式.demoone.interfaces.iml.Quck;

/**
 * @Author: 世墨
 * @Date: 2022/2/16 10:39
 * @DESCRIPTION 绿头鸭子
 */
public class MallardDuck extends Duck {

    //第三次添加
    public MallardDuck(){
        super.quackBehavior = new Quck();
        super.flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("我是绿头");
    }
}
