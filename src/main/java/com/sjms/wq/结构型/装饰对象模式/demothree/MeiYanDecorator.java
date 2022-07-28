package com.sjms.wq.结构型.装饰对象模式.demothree;

/**
 * <p>
 *  测试 {@link com.sjms.wq.结构型.装饰者模式.demothree.Test#test}
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 11:24
 */
public class MeiYanDecorator implements TikTokDecorator{

    private ManTikTok manTikTok;

    public MeiYanDecorator(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }

    @Override
    public void tiktok() {
        //增强功能
        enableMeiYan();
        manTikTok.tiktok();
    }

    @Override
    public void enableMeiYan() {
        System.out.println("开启美颜");
    }
}
