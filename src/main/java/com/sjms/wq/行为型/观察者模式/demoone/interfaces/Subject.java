package com.sjms.wq.行为型.观察者模式.demoone.interfaces;

/**
 * @Author: 世墨
 * @Date: 2022/2/17 15:56
 * @DESCRIPTION  主题
 */
public interface Subject {
    void registerObserver(Observre observre);//注册观察者
    void removeObserver(Observre observre);//删除观察者
    void notifyObserver();//通知观察者
}
