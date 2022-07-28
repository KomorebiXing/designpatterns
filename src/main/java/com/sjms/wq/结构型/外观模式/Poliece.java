package com.sjms.wq.结构型.外观模式;

/**
 * <p>
 * 公安局
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 16:18
 */
public class Poliece {
    public void dealWith(String name){
        System.out.println(name + Poliece.class.getSimpleName() + Poliece.class.getMethods()[0]);
    }
}
