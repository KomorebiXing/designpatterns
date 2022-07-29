package com.sjms.wq.行为型.状态模式;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 10:34
 */
public class MatchState implements TeamState {

    @Override
    public void playGame() {
        System.out.println("全力以赴,打游戏");
    }

    @Override
    public TeamState next() {
        System.out.println("进入下一个状态");
        return new VocationState();
    }
}
