package com.sjms.wq.策略模式.demoone.interfaces.iml;

import com.sjms.wq.策略模式.demoone.interfaces.FlyBehavior;

/**
 * @Author: 世墨
 * @Date: 2022/2/16 13:47
 * @DESCRIPTION 实现鸭子行为的类
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞呀飞呀！！！");
    }
}
