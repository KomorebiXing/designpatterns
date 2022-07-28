package com.sjms.wq.结构型.适配器模式.demotwo.bo;

/**
 * @Author: 世墨
 * @Date: 2022/4/6 15:47
 * @DESCRIPTION 家庭影院 外观类
 */
public class HomeTheaterFacade {

    Amplifler amplifler;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    DdPlayer ddPlayer;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    PopcomPopper popcomPopper;

    public HomeTheaterFacade(Amplifler amplifler, Tuner tuner, DvdPlayer dvdPlayer, DdPlayer ddPlayer, Projector projector, TheaterLights theaterLights, Screen screen, PopcomPopper popcomPopper) {
        this.amplifler = amplifler;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.ddPlayer = ddPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popcomPopper = popcomPopper;
    }

    /**
     * 看电影
     */
    public void wathMovie(String movie){
        System.out.println("开始电影");
        popcomPopper.on();
        popcomPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        amplifler.on();
        amplifler.setDvd();
        amplifler.setSurroundSoud();
        amplifler.setVolunme(5);
        dvdPlayer.on();
        dvdPlayer.paly(movie);
    }

    /**
     * 结束电影
     */
    public void endMovie(){
        System.out.println("结束电影");
        popcomPopper.off();
        theaterLights.off();
        screen.up();
        projector.off();
        amplifler.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

    /**
     * 听听CD
     */
    public void listenToCd(){

    }

    public void endCd(){

    }

    /**
     * 听广播
     */
    public void ListenToRadio(){

    }

    /**
     * 结束电台
     */
    public void endRadio(){

    }
}
