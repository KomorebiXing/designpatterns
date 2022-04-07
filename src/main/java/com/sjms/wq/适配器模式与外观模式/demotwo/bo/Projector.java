package com.sjms.wq.适配器模式与外观模式.demotwo.bo;

/**
 * @Author: 世墨
 * @Date: 2022/4/6 15:37
 * @DESCRIPTION 投影仪
 */
public class Projector {

    public void on(){
        System.out.println(Projector.class.getName() + "————>  on");
    }

    public void off(){
        System.out.println(Projector.class.getName() + "————>  off");
    }

    /**
     * tb 模式
     */
    public void tbMode(){

    }

    /**
     * 宽屏模式
     */
    public void wideScreenMode(){


    }

    @Override
    public String toString() {
        return super.toString();
    }
}
