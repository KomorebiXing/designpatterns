package com.sjms.wq.观察者模式.demoone.interfaces;

/**
 * @Author: 世墨
 * @Date: 2022/2/17 15:59
 * @DESCRIPTION  观察者 更新
 */
public interface Observre {
    /**
     * 当气象观测值改变时，主题会把这些状态值当作方法的参数，传送给观察者
     * @param trmp
     * @param hunifity
     * @param pressure
     */
    void update(float trmp ,float hunifity,float pressure);
}
