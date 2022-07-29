package com.sjms.wq.行为型.观察者模式.demoone.bo;

import com.sjms.wq.行为型.观察者模式.demoone.interfaces.DispalyElement;
import com.sjms.wq.行为型.观察者模式.demoone.interfaces.Observre;
import com.sjms.wq.行为型.观察者模式.demoone.interfaces.Subject;
import lombok.NoArgsConstructor;

/**
 * @Author: 世墨
 * @Date: 2022/2/17 16:08
 * @DESCRIPTION 显示天气预报
 */
@NoArgsConstructor
public class ForecastDisplay implements Subject, Observre, DispalyElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public ForecastDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay当前状态显示：");
        System.out.println("温度：" + temperature);
        System.out.println("湿度：" + humidity);
        System.out.println("气压：" + pressure);
    }



    @Override
    public void registerObserver(Observre observre) {
        subject.registerObserver(observre);
    }

    @Override
    public void removeObserver(Observre observre) {
        subject.removeObserver(observre);
    }

    @Override
    public void notifyObserver() {

    }

    @Override
    public void update(float trmp, float hunifity, float pressure) {
        this.temperature = trmp;
        this.humidity = hunifity;
        this.pressure = pressure;
        display();
    }
}
