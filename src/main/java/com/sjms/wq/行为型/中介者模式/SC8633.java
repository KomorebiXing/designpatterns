package com.sjms.wq.行为型.中介者模式;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 11:13
 */
public class SC8633 extends AbstractCaptain {

    public SC8633(Integer id) {
        super.setId(id);
    }

    @Override
    void fly() {
        System.out.println("SC8633请求起飞");
        super.getAbstractControlTower().processor(this,"fly");
    }

    @Override
    void land() {
        System.out.println("SC8633请求降落");
        super.getAbstractControlTower().processor(this,"land");
    }

    @Override
    void success() {
        System.out.println("完成");
        super.getAbstractControlTower().processor(this,"success");
    }

}
