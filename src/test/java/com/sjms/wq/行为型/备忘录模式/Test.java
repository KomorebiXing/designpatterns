package com.sjms.wq.行为型.备忘录模式;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 14:20
 */
public class Test {

    @org.junit.jupiter.api.Test
    void test(){
        ZhangYiXing zhangYiXing = new ZhangYiXing();
        zhangYiXing.playGame();
        zhangYiXing.saveGameRecord();

        zhangYiXing.playGame();
        zhangYiXing.playGame();
        zhangYiXing.saveGameRecord();

        zhangYiXing.playGame();
        zhangYiXing.saveGameRecord();

        //获取备忘录的信息 可以理解为 回滚了
        zhangYiXing.getFromMemento(1);
    }
}
