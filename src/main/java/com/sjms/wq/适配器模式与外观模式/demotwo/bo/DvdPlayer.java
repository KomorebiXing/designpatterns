package com.sjms.wq.适配器模式与外观模式.demotwo.bo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Author: 世墨
 * @Date: 2022/4/6 15:28
 * @DESCRIPTION
 */
public class DvdPlayer {
    Amplifler amplifler;

    public void on(){
        System.out.println(DvdPlayer.class.getName() + "————>  on");
    }

    public void off(){
        System.out.println(DvdPlayer.class.getName() + "————>  off");
    }

    /**
     * 喷射
     */
    public void eject(){
        System.out.println("设置eject");
    }

    /**
     * 暂停
     */
    public void pause(){

    }

    public void paly(String movie){
        System.out.println("播放电影,名称为：" + movie);
    }

    /**
     * 停止
     */
    public void stop(){
        System.out.println("设置stop");
    }

    /**
     * 设置环绕声
     */
    public void setSurroundAudio(){

    }

    /**
     * 设置两声道音频
     */
    public void setTwoChannelAudio(){

    }
}
