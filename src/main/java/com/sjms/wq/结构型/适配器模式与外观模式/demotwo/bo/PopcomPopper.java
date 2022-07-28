package com.sjms.wq.结构型.适配器模式与外观模式.demotwo.bo;

/**
 * @Author: 世墨
 * @Date: 2022/4/6 15:36
 * @DESCRIPTION 爆米花机
 */
public class PopcomPopper {
    public void on(){
        System.out.println(PopcomPopper.class.getName() + "————>  on");
    }

    public void off(){
        System.out.println(PopcomPopper.class.getName() + "————>  off");
    }

    public void pop(){
        System.out.println("设置pop");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
