package com.sjms.wq.观察者模式.demoone;

import com.sjms.wq.观察者模式.demoone.bo.CurrentConditionsDispaly;
import com.sjms.wq.观察者模式.demoone.bo.ForecastDisplay;
import com.sjms.wq.观察者模式.demoone.bo.WeatherData;
import com.sjms.wq.观察者模式.demoone.interfaces.Subject;

/**
 * @Author: 世墨
 * @Date: 2022/2/17 15:06
 * @DESCRIPTION
 */
public class Test {
    /**
     * 什么是观察者模式  新的设计原则：为了交互对象之间的松耦合设计而努力
     *
     * 举个生活中的例子 比如
     * 生活中的报纸或者杂志的订阅，报社每天会给订阅了报纸的定期送报纸，如果订阅人不想看了，取消订阅就会不进行送报纸
     *
     * 总结：出版者 + 订阅者 = 观察者模式 ===》 主题 + 观察者 = 观察者模式
     * 1.主题对象管理某些数据
     * 2.当主题内的数据改变就会通知观察者
     * 3.一旦数据改变，新的数据会以某种形式送到观察者手上
     * 4.观察者对象已经订阅主题以便再主题数据改变时能够收到更新
     *
     * 简单话来说：观察者模式 定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，她的所有依赖者都会收到通知并自动更新。
     */


    @org.junit.jupiter.api.Test
    void test_observer(){
        final WeatherData weatherData = new WeatherData();
        final CurrentConditionsDispaly currentConditionsDispaly = new CurrentConditionsDispaly(weatherData);
        final ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(10f,12f,14f);
        weatherData.setMeasurements(1f,1f,1f);
        weatherData.setMeasurements(2f,2f,2f);
    }

}
