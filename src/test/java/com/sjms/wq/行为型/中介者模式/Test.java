package com.sjms.wq.行为型.中介者模式;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 11:41
 */
public class Test {

    @org.junit.jupiter.api.Test
    void test(){
        final ControlTower controlTower = new ControlTower();
        final SC8633 sc8633 = new SC8633(1);
        final XC9527 xc9527 = new XC9527(2);
        final List<AbstractCaptain> arrayList = new ArrayList<>();
        arrayList.add(sc8633);
        arrayList.add(xc9527);
        controlTower.init(arrayList);
        sc8633.setAbstractControlTower(controlTower);
        sc8633.fly();
        xc9527.setAbstractControlTower(controlTower);
        sc8633.success();
        xc9527.fly();

    }

}
