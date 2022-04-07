package com.sjms.wq.适配器模式与外观模式.demotwo.bo;

import java.util.StringJoiner;

/**
 * @Author: 世墨
 * @Date: 2022/4/6 15:28
 * @DESCRIPTION dd播放器
 */
public class DdPlayer {

    Amplifler amplifler;

    public void on(){
        System.out.println(DdPlayer.class.getName() + "————>  on");
    }

    public void off(){
        System.out.println(DdPlayer.class.getName() + "————>  off");
    }

    /**
     * 喷射
     */
    public void eject(){

    }

    /**
     * 暂停
     */
    public void pause(){

    }

    public void paly(){

    }

    /**
     * 停止
     */
    public void stop(){

    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DdPlayer.class.getSimpleName() + "[", "]")
                .add("amplifler=" + amplifler)
                .toString();
    }
}
