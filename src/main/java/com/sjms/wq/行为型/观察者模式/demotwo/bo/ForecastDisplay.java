package com.sjms.wq.行为型.观察者模式.demotwo.bo;

import com.sjms.wq.行为型.观察者模式.demotwo.intrfaces.DispalyElement;

import java.util.Observable;
import java.util.Observer;


/**
 * @Author: 世墨
 * @Date: 2022/3/4 10:05
 * @DESCRIPTION 预测显示
 */
public class ForecastDisplay implements Observer,DispalyElement {

    private float currentPressure = 29.92f;
    private float lastPressure;


    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("输出：" + lastPressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof WeatherData){
            WeatherData weatherData = (WeatherData)arg;
            //设置值
            lastPressure = currentPressure;
            this.currentPressure = weatherData.getPressure();
            //进行通知模板显示
            display();
        }
    }
}
