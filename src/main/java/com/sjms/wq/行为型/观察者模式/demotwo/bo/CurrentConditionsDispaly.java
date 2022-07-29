package com.sjms.wq.行为型.观察者模式.demotwo.bo;


import com.sjms.wq.行为型.观察者模式.demotwo.intrfaces.DispalyElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: 世墨
 * @Date: 2022/3/3 15:18
 * @DESCRIPTION
 */
public class CurrentConditionsDispaly implements Observer, DispalyElement {

    private float temperature;
    private float humidity;

    public CurrentConditionsDispaly(Observable observable) {
        //用的精髓 使用this 谁调用就放入谁
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof WeatherData){
            WeatherData weatherData = (WeatherData)arg;
            //设置值
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            //进行通知模板显示
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("显示输出：温度 - " + temperature + "湿度 - " + humidity);
    }
}
