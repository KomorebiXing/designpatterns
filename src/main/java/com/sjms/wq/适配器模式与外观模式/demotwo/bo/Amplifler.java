package com.sjms.wq.适配器模式与外观模式.demotwo.bo;

/**
 * @Author: 世墨
 * @Date: 2022/4/6 15:23
 * @DESCRIPTION 放映机
 */
public class Amplifler {

    Tuner tuner;
    DvdPlayer dvdPlayer;
    DdPlayer cdPlayer;

    public Amplifler(Tuner tuner, DvdPlayer dvdPlayer, DdPlayer cdPlayer) {
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
    }

    public void on(){
        System.out.println(Amplifler.class.getName() + "————>  on");
    }

    public void off(){
        System.out.println(Amplifler.class.getName() + "————>  off");
    }

    public void setCd(){

    }

    public void setDvd(){
        System.out.println("设置dvd");
    }

    /**
     * 设置立体声
     */
    public void setStereSound(){

    }

    /**
     * 设置环绕声
     */
    public void setSurroundSoud(){

    }

    /**
     * 设置调谐器
     */
    public void setTuner(int tuner){
        this.tuner.setFm(tuner);
    }

    /**
     * 设置音量
     */
    public void setVolunme(int tuner){
        this.tuner.setAm(tuner);
    }

    @Override
    public String toString(){
        return null;
    }
}
