package com.sjms.wq.适配器模式与外观模式.demotwo.bo;

/**
 * @Author: 世墨
 * @Date: 2022/4/6 15:35
 * @DESCRIPTION 屏幕
 */
public class Screen {
    public void up(){
        System.out.println(Screen.class.getName() + "————>  up");
    }

    public void down(){
        System.out.println(Screen.class.getName() + "————>  down");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
