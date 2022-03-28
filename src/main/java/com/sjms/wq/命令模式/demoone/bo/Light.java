package com.sjms.wq.命令模式.demoone.bo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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
