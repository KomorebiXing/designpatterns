package com.sjms.wq.适配器模式与外观模式.demoone;

import com.sjms.wq.适配器模式与外观模式.demoone.interfaces.Duck;
import com.sjms.wq.适配器模式与外观模式.demoone.interfaces.Turkey;

/**
 * @Author: 世墨
 * @Date: 2022/4/6 14:09
 * @DESCRIPTION 适配器
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        //因为火鸡飞的时间短，所有加长时间
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
