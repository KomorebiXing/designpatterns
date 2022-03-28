package com.sjms.wq.观察者模式.demoone.bo;

import com.sjms.wq.观察者模式.demoone.interfaces.Observre;
import com.sjms.wq.观察者模式.demoone.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 世墨
 * @Date: 2022/2/17 14:51
 * @DESCRIPTION 气象站
 */
public class WeatherData implements Subject {


    private float temperature;
    private float humidity;
    private float pressure;

    //这三个方法各自返回最近的气象测量数据  分别是 温度，湿度，气压  此例子中 我们不需要关心这三个数据是如何被设置的 假设weatherdata自己知道如何从气象站获取更新信息
    public float getTemperature(){
        return temperature;
    }
    public float getHumidity(){
        return humidity;
    }
    public float getPressure(){
        return pressure;
    }


    /**
     * 一旦气象测量更新，此方法会被调用 measurementsChanged()
     */
    /*************************第一次 错误的示范*****************************************/
//    public void measurementsChanged(){
//        final float temperature = getTemperature();
//        final float humidity = getHumidity();
//        final float pressure = getPressure();
//
//        //面板1 修改值 temperature humidity pressure
//        //面板2 修改值 temperature humidity pressure
//        //面板3 修改值 temperature humidity pressure
//    }
    // 以上的坏处是：针对具体实现编程，会导致我们以后再增加活删除布告板时必须修改程序，同时因为修改面板的值都是 温度,湿度，气压 可以进行提取 公共部分


    /*************************第二次*****************************************/

    //注册列表
    private List<Observre> observres;

    //初始化 集合
    public WeatherData(){
        observres = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observre observre) {
        observres.add(observre);
    }

    @Override
    public void removeObserver(Observre observre) {
        int i = observres.indexOf(observre);
        if (i >= 0){
            observres.remove(observre);
        }
    }

    @Override
    public void notifyObserver() { //通知所有的观察者
        for (final Observre observre : observres) {
            observre.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }


    /**
     * 此方式 是为了用来测试 使用 真实的场景 是自己去用代码去爬虫获取
     * @param trmp
     * @param hunifity
     * @param pressure
     */
    public void setMeasurements(float trmp ,float hunifity,float pressure){
        this.temperature = trmp;
        this.humidity = hunifity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
