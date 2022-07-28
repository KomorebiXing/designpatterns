package com.sjms.wq.结构型.适配器模式.demotwo.bo;


/**
 * @Author: 世墨
 * @Date: 2022/4/6 15:28
 * @DESCRIPTION 调谐器
 */
public class Tuner {

    Amplifler amplifier;

    public void on(){
        System.out.println(Tuner.class.getName() + "————>  on");
    }

    public void off(){
        System.out.println(Tuner.class.getName() + "————>  off");
    }

    public void setAm(int i){
        System.out.println("设置AM为：" + i);
    }

    /**
     * 设置调频
     */
    public void setFm(int i){
        System.out.println("设置调频为：" + i);
    }

    /**
     * 设置频率
     */
    public void setFrequency(int i){
        System.out.println("设置频率为：" + i);
    }

    @Override
    public String toString() {
        return null;
    }
}
