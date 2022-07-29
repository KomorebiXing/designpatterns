package com.sjms.wq.行为型.策略模式.demotwo;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 10:08
 */
public class UziStrategy implements GameStrategy {

    @Override
    public void watStrategy() {
        System.out.println("冲啊,杀啊");
    }
}
