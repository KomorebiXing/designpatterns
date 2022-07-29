package com.sjms.wq.行为型.状态模式;


/**
 * <p>
 * 环境类
 * 测试 {@link com.sjms.wq.行为型.状态模式.Test#test()}
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 10:33
 */
public class SKTTeam {

    /**
     * 状态
     */
    private TeamState teamState;

    public void setTeamState(TeamState teamState) {
        this.teamState = teamState;
    }

    /**
     * 开始游戏
     */
    public void startGame(){
        //状态不同会导致不同的游戏结果
        teamState.playGame();
    }

    public void setNewState(){
        this.teamState = teamState.next();
    }

}
