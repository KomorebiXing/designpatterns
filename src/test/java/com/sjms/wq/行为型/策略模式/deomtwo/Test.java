package com.sjms.wq.行为型.策略模式.deomtwo;

import com.sjms.wq.行为型.策略模式.demotwo.SteadyStrategy;
import com.sjms.wq.行为型.策略模式.demotwo.TeamGNR;
import com.sjms.wq.行为型.策略模式.demotwo.UziStrategy;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 10:12
 */
public class Test {

    @org.junit.jupiter.api.Test
    void test(){
        final TeamGNR teamGNR = new TeamGNR();
        teamGNR.setGameStrategy(new UziStrategy());
        teamGNR.startGame();
        teamGNR.setGameStrategy(new SteadyStrategy());
        teamGNR.startGame();
    }
}
