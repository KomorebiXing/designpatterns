package com.sjms.wq.观察者模式.demotwo;

import com.sjms.wq.观察者模式.demotwo.bo.ForecastDisplay;
import com.sjms.wq.观察者模式.demotwo.bo.CurrentConditionsDispaly;
import com.sjms.wq.观察者模式.demotwo.bo.WeatherData;

/**
 * @Author: 世墨
 * @Date: 2022/3/4 10:20
 * @DESCRIPTION 利用java自带的观察者
 */
public class Test {

    @org.junit.jupiter.api.Test
    void test_observer(){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDispaly currentConditionsDispaly = new CurrentConditionsDispaly(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        currentConditionsDispaly.display();
        forecastDisplay.display();
        weatherData.setMeasurements(1f,2f,3f);
    }


    /**
     *  使用观察者被通知的次序被改变了
     *
     *  java 中这个Observerble 是一个类 在java 中只有单继承，没有多继承，如果某类想同时具有Observerble和另一个超类的行为
     *  就会陷入两难，这就限制了Observerble的复用潜力，所有在使用的时候需要考虑清楚
     */
}
