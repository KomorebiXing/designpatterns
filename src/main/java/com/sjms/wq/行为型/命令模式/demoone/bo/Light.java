package com.sjms.wq.行为型.命令模式.demoone.bo;

/**
 * @Author: 世墨
 * @Date: 2022/3/27 13:25
 * @DESCRIPTION  灯泡类
 */
public  class Light {

    /**
     * 开
     */
    public  void on(){
        System.out.println("开灯");
    };

    /**
     * 关
     */
    public  void off(){
        System.out.println("关灯");
    };
}
