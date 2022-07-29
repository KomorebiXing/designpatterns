package com.sjms.wq.行为型.访问者模式;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 16:27
 */
public class Test {

    @org.junit.jupiter.api.Test
    void test(){
        final XiaoAi xiaoAi = new XiaoAi();
        xiaoAi.answerQuestion();

        //进行升级操作 希望cpu联网处理指令
        //硬盘改为云存储
        xiaoAi.acceptUpdate(new UpdatePackage());
        xiaoAi.answerQuestion();
    }
}
