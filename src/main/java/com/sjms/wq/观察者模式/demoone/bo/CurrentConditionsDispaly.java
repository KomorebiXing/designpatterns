package com.sjms.wq.观察者模式.demoone.bo;

import com.sjms.wq.观察者模式.demoone.interfaces.DispalyElement;
import com.sjms.wq.观察者模式.demoone.interfaces.Observre;
import com.sjms.wq.观察者模式.demoone.interfaces.Subject;
import lombok.NoArgsConstructor;

/**
 * @Author: 世墨
 * @Date: 2022/2/17 16:04
 * @DESCRIPTION 当前状态显示
 */
@NoArgsConstructor
public class CurrentConditionsDispaly implements Subject, Observre, DispalyElement {

    private float temperature;
    private float humidity;

    private Subject subject;

    public CurrentConditionsDispaly(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("CurrentConditionsDispaly当前状态显示：");
        System.out.println("温度：" + temperature);
        System.out.println("湿度：" + humidity);

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
        display();
    }
}
