package com.sjms.wq.结构型.代理模式.dynamic;


import com.sjms.wq.结构型.装饰对象模式.demothree.ManTikTok;

/**
 * <p>
 * 被代理者
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 11:20
 */
public class JDKLeiTikTok implements ManTikTok,SellTikTok {

    @Override
    public void tiktok() {
        System.out.println("王波开直播中.......");
    }

    @Override
    public void sell() {
        System.out.println("王波还要卖货,搞死人");
    }
}
