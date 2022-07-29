package com.sjms.wq.行为型.策略模式.demoone.interfaces.iml;

import com.sjms.wq.行为型.策略模式.demoone.interfaces.QuackBehavior;

/**
 * @Author: 世墨
 * @Date: 2022/2/16 13:50
 * @DESCRIPTION 鸭子行为不会叫
 */
public class MuteQuck implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我是鸭子,但是我不会叫！！！");
    }
}
