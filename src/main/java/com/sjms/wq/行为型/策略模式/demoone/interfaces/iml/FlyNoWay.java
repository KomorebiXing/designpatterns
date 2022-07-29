package com.sjms.wq.行为型.策略模式.demoone.interfaces.iml;

import com.sjms.wq.行为型.策略模式.demoone.interfaces.FlyBehavior;

/**
 * @Author: 世墨
 * @Date: 2022/2/16 13:48
 * @DESCRIPTION 实现鸭子不会飞的类
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我是鸭子，但是我不会飞");
    }
}
