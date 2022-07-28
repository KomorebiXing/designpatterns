package com.sjms.wq.结构型.组合模式;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 16:56
 */
public class Test {

    @org.junit.jupiter.api.Test
    void test(){
         Menu menu1 = new Menu(0, "节点" + 0 );
         Menu menu;
        for (int i = 1; i < 10; i++) {
            menu = new Menu(i, "节点" + i);
            menu1.addChildMenu(menu);
            menu = menu1;
        }
        menu1.printMenu();
        /**
         * 节点0
         * 节点1
         * 节点2
         * 节点3
         * 节点4
         * 节点5
         * 节点6
         * 节点7
         * 节点8
         * 节点9
         */
    }

}
