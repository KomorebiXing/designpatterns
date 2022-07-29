package com.sjms.wq.行为型.观察者模式.demothree;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 12:50
 */
public class Test {

    @org.junit.jupiter.api.Test
    void test(){
        MMTikToker abstractTikToker = new MMTikToker();
        abstractTikToker.addFans(new HuManFans());
        abstractTikToker.addFans(new YingxinFans());

        abstractTikToker.startSell();
        abstractTikToker.endSell();
    }

}
