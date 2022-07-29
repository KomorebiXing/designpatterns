package com.sjms.wq.行为型.观察者模式.demotwo.bo;

import java.util.Observable;

/**
 * @Author: 世墨
 * @Date: 2022/3/3 13:38
 * @DESCRIPTION  利用java提供的观察者模式
 */

/**
 * Observable类 解读  方法中都是枷锁的存在
 *  1. 有两个属性
 *     private boolean changed = false; 标识默认为false
 *     private Vector<Observer> obs;
 *     Observer ：接口 每当观察到的对象发生变化时，都会调用此方法。应用程序调用 <tt>Observable<tt> 对象的 <code>notifyObservers<code> 方法来通知对象的所有观察者更改。
 *     Vector 类实现了一个动态数组 类似一个List
 *  2. 一个无参的构造器
 *    用来初始化 动态数据 Vector
 *  3.方法
 *    addObserver() 增加观察者
 *    deleteObserver() 删除观察者
 *    notifyObservers() 通知观察者方法
 *    notifyObservers(Object arg) 通知观察者方法
 *    deleteObservers() 清除所有的观察者 也就是清空给List
 *    setChanged() 修改观察者的标识 true
 *    clearChanged() 清除标识  false
 *    hasChanged() 测试对象的标识是否已经发生改变
 *    countObservers() 返回观察者的数量
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {}

    //测量值已更改
    public void measurementsChanged(){
        setChanged();
        //通知每一个观察者
        notifyObservers(this);
    }

    //设置测量值
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity  = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
