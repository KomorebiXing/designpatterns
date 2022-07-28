package com.sjms.wq.结构型.外观模式;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 16:23
 */
public class Test {

    @org.junit.jupiter.api.Test
    void test(){
        final WeiXinFacade weiXinFacade = new WeiXinFacade();
        weiXinFacade.handle("王波开始喽");
    }
}
