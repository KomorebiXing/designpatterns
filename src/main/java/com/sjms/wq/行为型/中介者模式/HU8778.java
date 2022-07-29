package com.sjms.wq.行为型.中介者模式;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 11:12
 */
public class HU8778 extends AbstractCaptain {

    public HU8778(Integer id) {
        super.setId(id);
    }

    @Override
    void fly() {
        System.out.println("HU8778请求起飞");
        super.getAbstractControlTower().processor(this,"fly");
    }

    @Override
    void land() {
        System.out.println("HU8778请求降落");
        super.getAbstractControlTower().processor(this,"land");
    }

    @Override
    void success() {
        System.out.println("完成");
        super.getAbstractControlTower().processor(this,"success");
    }

}
