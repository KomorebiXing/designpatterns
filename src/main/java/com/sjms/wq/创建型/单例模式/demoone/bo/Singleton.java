package com.sjms.wq.创建型.单例模式.demoone.bo;

import java.util.Objects;

/**
 * @Author: 世墨
 * @Date: 2022/3/24 10:42
 * @DESCRIPTION 简单的单例模板
 */
public class Singleton {

    /**
     * 利用一个静态变量来记录Singleton类的唯一实例
     */
    private static Singleton unigqueInstance;

    private Singleton() {
        System.out.println("我被创建了");
    }

    /**
     * 利用静态方法去做一个类的唯一实例
     *
     * 不足之处：
     *
     * @return
     */
    public static Singleton getUnigqueInstance() {
        if (Objects.isNull(unigqueInstance)){
            System.out.println("创建新的实例");
            unigqueInstance = new Singleton();
        }
        return unigqueInstance;
    }
}
