package com.sjms.wq.结构型.适配器模式与外观模式.demoone.bo;

import com.sjms.wq.结构型.适配器模式与外观模式.demoone.interfaces.Turkey;

/**
 * @Author: 世墨
 * @Date: 2022/4/6 14:07
 * @DESCRIPTION
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("我是火鸡,咯咯！");
    }

    @Override
    public void fly() {
        System.out.print("短距离的飞行 ");
    }
}
