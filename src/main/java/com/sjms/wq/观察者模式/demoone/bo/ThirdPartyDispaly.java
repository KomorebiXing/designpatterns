package com.sjms.wq.观察者模式.demoone.bo;

import com.sjms.wq.观察者模式.demoone.interfaces.DispalyElement;
import com.sjms.wq.观察者模式.demoone.interfaces.Observre;
import com.sjms.wq.观察者模式.demoone.interfaces.Subject;

/**
 * @Author: 世墨
 * @Date: 2022/2/17 16:07
 * @DESCRIPTION 显示基于观察值的其他内容
 */
public class ThirdPartyDispaly implements Subject, Observre, DispalyElement {
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
