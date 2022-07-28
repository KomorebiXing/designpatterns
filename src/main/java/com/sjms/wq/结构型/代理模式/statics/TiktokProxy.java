package com.sjms.wq.结构型.代理模式.statics;


/**
 * <p>
 * 代理对象
 *测试 {@link com.sjms.wq.结构型.代理模式.Test#static_test()}
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 14:00
 */
public class TiktokProxy implements ManTikTok {


    private final ManTikTok manTikTok;

    public TiktokProxy(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }

    //代理就是 我们想怎么做就怎么做
    @Override
    public void tiktok() {
        System.out.println("我是代理者哦,我先要布置直播现场");
        manTikTok.tiktok();
        System.out.println("我是代理者哦,我还要清理直播现场，真惨");
    }
}
