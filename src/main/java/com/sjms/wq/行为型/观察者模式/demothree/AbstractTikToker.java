package com.sjms.wq.行为型.观察者模式.demothree;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 抽象主播
 * 粉丝 观察主播
 * 测试 {@link com.sjms.wq.行为型.观察者模式.demothree.Test#test()}
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 12:37
 */
public abstract class AbstractTikToker {

    /**
     * 观察者的核心就是 这个 列表 遍历 通知干什么事情
     */
    private List<AbstractFans> abstractFansList =  new ArrayList<>();

    /**
     * 添加粉丝
     */
    void addFans(AbstractFans abstractFans) {
        this.abstractFansList.add(abstractFans);
    };

    /**
     * 通知粉丝
     */
    abstract void notifyFans(String msg);

    public List<AbstractFans> getAbstractFans() {
        return abstractFansList;
    }

    public void setAbstractFans(List<AbstractFans> abstractFans) {
        this.abstractFansList = abstractFans;
    }
}
