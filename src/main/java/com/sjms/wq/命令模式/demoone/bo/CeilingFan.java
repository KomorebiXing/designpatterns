package com.sjms.wq.命令模式.demoone.bo;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @Author: 世墨
 * @Date: 2022/3/28 17:51
 * @DESCRIPTION 吊扇类
 */
public class CeilingFan {

    //高
    public static final int HIGH = 3;
    //中
    public static final int MEDIUM = 2;
    //低
    public static final int LOW = 1;
    //关闭
    public static final int OFF = 0;

    //当前速度在什么位置
    String localion;
    //速度
    int speed;

    public CeilingFan(String localion) {
        this.localion = localion;
        this.speed = OFF;
    }

    public void  high(){
        speed  = HIGH;
    }

    public void  medium(){
        speed  = MEDIUM;
    }

    public void  low(){
        speed  = LOW;
    }

    public void  off(){
        speed  = OFF;
    }

    /**
     * 可利用get 方法获取当前转速
     * @return
     */
    public int getSpeed() {
        return speed;
    }
}
