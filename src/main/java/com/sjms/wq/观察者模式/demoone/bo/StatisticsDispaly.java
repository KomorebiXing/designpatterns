package com.sjms.wq.观察者模式.demoone.bo;

import com.sjms.wq.观察者模式.demoone.interfaces.DispalyElement;
import com.sjms.wq.观察者模式.demoone.interfaces.Observre;
import com.sjms.wq.观察者模式.demoone.interfaces.Subject;

/**
 * @Author: 世墨
 * @Date: 2022/2/17 16:06
 * @DESCRIPTION 统计显示 显示最小平均和最大的观测值
 */
public class StatisticsDispaly  implements Subject, Observre, DispalyElement {
    @Override
    public void display() {

    }

    @Override
    public void registerObserver(Observre observre) {

    }

    @Override
    public void removeObserver(Observre observre) {

    }

    @Override
    public void notifyObserver() {

    }

    @Override
    public void update(float trmp, float hunifity, float pressure) {

    }
}
