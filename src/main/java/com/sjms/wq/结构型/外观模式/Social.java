package com.sjms.wq.结构型.外观模式;

/**
 * <p>
 * 社保局
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 16:19
 */
public class Social {
    public void dealWith(String name){
        System.out.println(name + Social.class.getSimpleName() + Social.class.getMethods()[0]);
    }
}
