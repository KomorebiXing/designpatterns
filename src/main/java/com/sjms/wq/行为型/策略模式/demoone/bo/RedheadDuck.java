package com.sjms.wq.行为型.策略模式.demoone.bo;

import com.sjms.wq.行为型.策略模式.demoone.interfaces.iml.FlyWithWings;
import com.sjms.wq.行为型.策略模式.demoone.interfaces.iml.Quck;

/**
 * @Author: 世墨
 * @Date: 2022/2/16 10:40
 * @DESCRIPTION 红头鸭子
 */
public class RedheadDuck extends Duck {
    //第三次添加
    public RedheadDuck(){
        super.quackBehavior = new Quck();
        super.flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("我是红头");
    }
}
