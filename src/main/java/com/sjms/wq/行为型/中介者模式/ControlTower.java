package com.sjms.wq.行为型.中介者模式;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <p>
 * 测试 {@link com.sjms.wq.行为型.中介者模式.Test#test()}
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 11:21
 */
public class ControlTower extends AbstractControlTower {

    private Map<Integer,AbstractCaptain> map = new HashMap<>();


    @Override
    void processor(AbstractCaptain abstractCaptain, String action) {
        if (("fly".equals(action) || "land".equals(action)) && map.values().stream().noneMatch(AbstractCaptain::isState)) {
            putTrue(abstractCaptain);
            System.out.println("允许");
        }else if (!"success".equals(action)){
            abstractCaptain.setTrueState();
            putTrue(abstractCaptain);
            System.out.println("不允许");
        }
        if ("success".equals(action)) {
            putFalse(abstractCaptain);
        }
    }

    private void putTrue(AbstractCaptain abstractCaptain){
        final AbstractCaptain abstractCaptain1 = map.get(abstractCaptain.getId());
        abstractCaptain1.setTrueState();
        map.put(abstractCaptain.getId(),abstractCaptain1);
    }


    private void putFalse(AbstractCaptain abstractCaptain){
        final AbstractCaptain abstractCaptain1 = map.get(abstractCaptain.getId());
        abstractCaptain1.setFalseState();
        map.put(abstractCaptain.getId(),abstractCaptain1);
    }

    public void init(List<AbstractCaptain> abstractCaptains){
        this.map.putAll(abstractCaptains.stream()
                .collect(Collectors.toMap(AbstractCaptain::getId, Function.identity())));
    }

}
