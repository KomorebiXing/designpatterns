package com.sjms.wq.结构型.外观模式;

/**
 * <p>
 * 教育局
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 16:19
 */
public class Edu {
    public void dealWith(String name){
        System.out.println(name + Edu.class.getSimpleName() + Edu.class.getMethods()[0]);
    }
}
