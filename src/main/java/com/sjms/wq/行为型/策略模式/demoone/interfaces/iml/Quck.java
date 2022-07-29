package com.sjms.wq.行为型.策略模式.demoone.interfaces.iml;

import com.sjms.wq.行为型.策略模式.demoone.interfaces.QuackBehavior;

/**
 * @Author: 世墨
 * @Date: 2022/2/16 13:49
 * @DESCRIPTION 会叫的鸭子 嘎嘎叫
 */
public class Quck implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我要嘎嘎叫！！！");
    }
}
