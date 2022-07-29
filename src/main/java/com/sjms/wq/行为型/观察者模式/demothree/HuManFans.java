package com.sjms.wq.行为型.观察者模式.demothree;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 12:48
 */
public class HuManFans extends AbstractFans{

    @Override
    void acceptMsg(String msg) {
        System.out.println("胡曼粉丝:" + msg);
    }
}
