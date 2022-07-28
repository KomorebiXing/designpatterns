package com.sjms.wq.创建型.工厂模式.demoone;

import com.sjms.wq.创建型.工厂模式.demoone.bo.NYPizzaStore;
import com.sjms.wq.创建型.工厂模式.demoone.bo.Pizza;
import com.sjms.wq.创建型.工厂模式.demoone.bo.PizzaStore;
import com.sjms.wq.创建型.工厂模式.demoone.bo.ZJGPizzaStore;
import com.sjms.wq.创建型.工厂模式.demoone.bo.simplepizzafactorys.SimplePizzaFactory;

/**
 * @Author: 世墨
 * @Date: 2022/3/11 19:50
 * @DESCRIPTION
 */
public class Test {

    /**
     * one.简单工厂测试 直接调用即可
     */
    @org.junit.jupiter.api.Test
    void test_simple_factory_one(){
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        Pizza cheese = simplePizzaFactory.createPizza("cheese");
        Pizza pepperoni = simplePizzaFactory.createPizza("pepperoni");
    }

    /**
     * two.通过订单的方式 来创建披萨类
     *
     * 引出依赖倒置原则：要依赖抽象，不要依赖具体实现 （提供一个思想 不要从顶层向下想，应该从下层向上看看能不能抽点东西出来）
     * 下面几种指导可以：可以避免你在OO设计中违反依赖倒置原则
     * 1.第一种：变量不可以持有具体类的引用  ----> 多态
     * 2.第二种：不要让类派生自具体类  ----> 利用抽象类
     * 3.第三种：不要覆盖基类中已实现的方法 ----> 继承的类 ，不要将父类中的已经实现的方法重写
     */
    @org.junit.jupiter.api.Test
    void test_simple_factory_two(){
        PizzaStore simplePizzaFactory = new SimplePizzaFactory();
        Pizza cheese = simplePizzaFactory.orderPizza("cheese");
    }


    /**
     *  three:加入新的需求；因为每个区域的原料制作不同，导致之前的那个类已经不满足了
     * 需要写一个原料工厂
     * 具体需求详细：
     *  先有三个区域：三个区域制作原料的方式是不同的
     *  芝加哥：
     *  纽约：
     */
    @org.junit.jupiter.api.Test
    void test_simple_factory_three(){
        PizzaStore simplePizzaFactory = new NYPizzaStore();
        Pizza cheese = simplePizzaFactory.orderPizza("cheese");
        PizzaStore zjgPizzaStore = new ZJGPizzaStore();
        Pizza pepperoni = zjgPizzaStore.orderPizza("pepperoni");
    }
}
