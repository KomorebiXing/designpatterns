package com.sjms.wq.行为型.模板方法模式.demotwo;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 8:57
 */
public class Test {

    @org.junit.jupiter.api.Test
    void test(){
        //精髓 通过继承的方式 子类拿到父类定义好的模板 调用
        final AutoCookMachine autoCookMachine = new AutoCookMachine();
        autoCookMachine.cook();
    }
}
