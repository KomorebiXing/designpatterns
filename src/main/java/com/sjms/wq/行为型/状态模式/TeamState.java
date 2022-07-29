package com.sjms.wq.行为型.状态模式;

/**
 * <p>
 * 团队状态
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 10:32
 */
public interface TeamState {

    /**
     * 玩游戏
     */
    void playGame();

    /**
     * 状态流转 切换到下一个状态 这就是状态模式的核心
     */
    TeamState next();
}
