package com.sjms.wq.结构型.装饰者模式.demothree;

import com.sjms.wq.结构型.装饰对象模式.demothree.LeiTikTok;
import com.sjms.wq.结构型.装饰对象模式.demothree.MeiYanDecorator;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 11:29
 */
public class Test {

    @org.junit.jupiter.api.Test
    void test(){
        //装饰器
        final MeiYanDecorator meiYanDecorator = new MeiYanDecorator(new LeiTikTok());
        meiYanDecorator.tiktok();
    }

}
