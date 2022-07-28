package com.sjms.wq.创建型.单例模式.demoone;

import com.sjms.wq.创建型.单例模式.demoone.bo.ChocolateBoiler;
import com.sjms.wq.创建型.单例模式.demoone.bo.ChocolateBoilerDoubleCheck;
import com.sjms.wq.创建型.单例模式.demoone.bo.ChocolateBoilerStaticProperties;
import com.sjms.wq.创建型.单例模式.demoone.bo.Singleton;

/**
 * @Author: 世墨
 * @Date: 2022/3/23 16:38
 * @DESCRIPTION 单例模式
 * 单例模式：确保一个类只有一个实例，并提供一个会全局访问点
 *
 */
public class Test {

    /**
     * 测试静态方法来获取单例
     */
    @org.junit.jupiter.api.Test
    void test_static_method(){
        System.out.println("第一次创建");
        Singleton unigqueInstance1 = Singleton.getUnigqueInstance();
        System.out.println("第二次创建");
        Singleton unigqueInstance = Singleton.getUnigqueInstance();
        System.out.println("比较两次创建结果：\n" + "第一次创建：\n" + unigqueInstance1 + "\n第二次创建\n" + unigqueInstance +
                "\n对比结果\n" + unigqueInstance.equals(unigqueInstance1));
    }

    /**
     * 巧克力工厂
     */
    @org.junit.jupiter.api.Test
    void test_chocolate_factory(){
        Runnable runnable = () -> {
            Thread.currentThread().setName("线程1");
            ChocolateBoiler instance1 = ChocolateBoiler.getInstance();
            instance1.fill();
            instance1.boil();
            instance1.drain();
            System.out.println(Thread.currentThread().getName() + instance1);
        };
        runnable.run();

        Thread.currentThread().setName("主线程");
        ChocolateBoiler instance = ChocolateBoiler.getInstance();
        instance.fill();
        instance.boil();
        instance.drain();
        System.out.println(Thread.currentThread().getName() + instance);
        //通过多线程去执行发现，已经有两个不同的工厂实例了
        //可以通过synchronized 来解决这个问题，但是因为这是重量级锁，同步进行，每个线程进入都要排队进入，会导致性能的原因
    }

    /**
     * 通过静态变量的方式来解决多线程的麻烦
     */
    @org.junit.jupiter.api.Test
    void test_static_properties(){
        Runnable runnable = () -> {
            Thread.currentThread().setName("线程1");
            ChocolateBoilerStaticProperties instance1 = ChocolateBoilerStaticProperties.getInstance();
            instance1.fill();
            instance1.boil();
            instance1.drain();
            System.out.println(Thread.currentThread().getName() + instance1);
        };
        runnable.run();

        Thread.currentThread().setName("主线程");
        ChocolateBoilerStaticProperties instance = ChocolateBoilerStaticProperties.getInstance();
        instance.fill();
        instance.boil();
        instance.drain();
        System.out.println(Thread.currentThread().getName() + instance);

        //通过打印的实例发现的确是同一个实例，就形成了单例
        //虽说是解决了,这个多线程的麻烦，但是这些类是提前创建好的，会存在浪费空间的资源
        //而且这个类，必须先创建实例之后，才能使用
    }

    /***
     * 通过双重校验的方式来来做单例
     * 先通过判断来看是否已经创建实例，如果没有就进行同步的方式
     * 还有可以利用内部类的方式去做 也是可以的
     */
    @org.junit.jupiter.api.Test
    void double_check(){
        Runnable runnable = () -> {
            Thread.currentThread().setName("线程1");
            ChocolateBoilerDoubleCheck instance1 = ChocolateBoilerDoubleCheck.getInstance();
            instance1.fill();
            instance1.boil();
            instance1.drain();
            System.out.println(Thread.currentThread().getName() + instance1);
        };
        runnable.run();

        Thread.currentThread().setName("主线程");
        ChocolateBoilerDoubleCheck instance = ChocolateBoilerDoubleCheck.getInstance();
        instance.fill();
        instance.boil();
        instance.drain();
        System.out.println(Thread.currentThread().getName() + instance);
    }

}
