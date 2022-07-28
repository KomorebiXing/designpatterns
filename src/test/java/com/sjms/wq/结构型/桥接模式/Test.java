package com.sjms.wq.结构型.桥接模式;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 10:45
 */
public class Test {
    @org.junit.jupiter.api.Test
    void test1(){
        IPhone iPhone = new IPhone();
        iPhone.setSale(new OfflineSale("线下",9999));
        System.out.println(iPhone.getPhone());
    }

}
