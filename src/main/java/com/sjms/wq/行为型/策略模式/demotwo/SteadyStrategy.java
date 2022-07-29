package com.sjms.wq.行为型.策略模式.demotwo;

/**
 * <p>
 * 稳健策略
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 10:07
 */
public class SteadyStrategy implements GameStrategy {

    @Override
    public void watStrategy() {
        System.out.println("猥琐发育...");
    }
}
