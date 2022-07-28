package com.sjms.wq.结构型.代理模式.statics;

import com.sjms.wq.结构型.代理模式.statics.ManTikTok;

/**
 * <p>
 * 被代理者
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 11:20
 */
public class LeiTikTok implements ManTikTok {

    @Override
    public void tiktok() {
        System.out.println("王波开直播中.......");
    }
}
