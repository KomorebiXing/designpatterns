package com.sjms.wq.结构型.适配器模式与外观模式.demotwo.bo;

/**
 * @Author: 世墨
 * @Date: 2022/4/6 15:36
 * @DESCRIPTION 剧院灯
 */
public class TheaterLights {

    public void on(){
        System.out.println(TheaterLights.class.getName() + "————>  on");
    }

    public void off(){
        System.out.println(TheaterLights.class.getName() + "————>  off");
    }

    public void dim(int i){
        System.out.println("设置dim为：" + i);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
