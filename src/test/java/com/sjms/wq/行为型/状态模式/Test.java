package com.sjms.wq.行为型.状态模式;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 10:45
 */
public class Test {

    @org.junit.jupiter.api.Test
    void test(){
        final SKTTeam sktTeam = new SKTTeam();
        sktTeam.setTeamState(new VocationState());
        sktTeam.startGame();
        for (int i = 0; i < 5; i++) {
            sktTeam.setNewState();
            sktTeam.startGame();
        }
    }

}
