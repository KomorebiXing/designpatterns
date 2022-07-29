package com.sjms.wq.行为型.观察者模式.demothree;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 12:49
 */
public class YingxinFans extends AbstractFans{

    @Override
    void acceptMsg(String msg) {
        System.out.println("艺兴：" + msg);
    }
}
