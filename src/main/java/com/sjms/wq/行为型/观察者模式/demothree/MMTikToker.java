package com.sjms.wq.行为型.观察者模式.demothree;

/**
 * <p>
 * 主播
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 12:36
 */
public class MMTikToker extends AbstractTikToker{

    public void startSell(){
        System.out.println("开始卖货");
        notifyFans("开始卖货啦,倒计时了");
    }

    public void endSell(){
        System.out.println("结束卖货");
        notifyFans("结束卖货,卖完啦");
    }

    @Override
    void addFans(AbstractFans abstractFans) {
        super.getAbstractFans().add(abstractFans);
    }

    @Override
    void notifyFans(String msg) {
        super.getAbstractFans().forEach(e -> e.acceptMsg(msg));
    }
}
