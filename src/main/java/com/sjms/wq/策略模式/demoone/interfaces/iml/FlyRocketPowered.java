package com.sjms.wq.策略模式.demoone.interfaces.iml;

import com.sjms.wq.策略模式.demoone.interfaces.FlyBehavior;

/**
 * @Author: 世墨
 * @Date: 2022/2/16 15:14
 * @DESCRIPTION
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我会飞,但是我是火箭飞行，哈哈哈哈哈");
    }
}
