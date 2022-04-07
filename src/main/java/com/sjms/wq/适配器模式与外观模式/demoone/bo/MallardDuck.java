package com.sjms.wq.适配器模式与外观模式.demoone.bo;

import com.sjms.wq.适配器模式与外观模式.demoone.interfaces.Duck;

/**
 * @Author: 世墨
 * @Date: 2022/4/6 14:05
 * @DESCRIPTION 绿头鸭子
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("我是绿头鸭子,呱呱叫！");
    }

    @Override
    public void fly() {
        System.out.println("飞行！");
    }
}
