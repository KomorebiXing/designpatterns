package com.sjms.wq.行为型.策略模式.demotwo;

/**
 * <p>
 * 环境类 如果策略超过四个 就要考虑 混合模式了
 * 测试 {@link com.sjms.wq.行为型.策略模式.deomtwo.Test#test()}
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 10:10
 */
public class TeamGNR {

    private GameStrategy gameStrategy;

    public void setGameStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void startGame(){
        System.out.println("游戏开始");
        gameStrategy.watStrategy();
        System.out.println("游戏结束");
    }

}
