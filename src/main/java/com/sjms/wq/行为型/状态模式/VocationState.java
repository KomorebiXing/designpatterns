package com.sjms.wq.行为型.状态模式;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 10:35
 */
public class VocationState implements TeamState{

    @Override
    public void playGame() {
        System.out.println("三亚旅游,不打游戏");
    }

    @Override
    public TeamState next() {
        System.out.println("进入下一个状态");
        return new BeafNodleState();
    }
}
