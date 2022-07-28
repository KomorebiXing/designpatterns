package com.sjms.wq.结构型.适配器模式.demothrer;

/**
 * <p>
 * 电影播放器
 * 阅读器
 * @see com.sjms.wq.结构型.适配器模式.Test#movie_test()  测试
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 9:36
 */
public class MoviePlayer implements Player{

    @Override
    public String play() {
        System.out.println("正在播放:庆余年");
        String content = "从前。。。";
        return content;
    }
}
