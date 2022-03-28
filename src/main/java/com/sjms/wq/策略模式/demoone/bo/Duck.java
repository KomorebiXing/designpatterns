package com.sjms.wq.策略模式.demoone.bo;

import com.sjms.wq.策略模式.demoone.interfaces.FlyBehavior;
import com.sjms.wq.策略模式.demoone.interfaces.QuackBehavior;

/**
 * @Author: 世墨
 * @Date: 2022/2/16 10:35
 * @DESCRIPTION 鸭子超类
 */
public class Duck {


    /********************************第一次**********************************************/
    /**
     * 鸭子中有三个行为 quack :叫  swim：会水 display:外观
     */
//    public void quack(){
//        System.out.println("嘎嘎");
//    }
    public void swim(){
        System.out.println("游泳");
    }
    public void display(){}

    /*********************************第二次*********************************************/
    /**
     * 现在有新的需求：要求鸭子要飞起来
     * 一般正常人的思维都是在这个超类中加一个方法 ： fly() 飞的方法
     * 但是出了问题，飞只对活物的描述，如果有一个橡皮鸭子，那么橡皮鸭子也是继承了超类，也是可以飞的
     */
    //飞的动作
//    public void fly(){
//        System.out.println("飞啊飞啊飞啊~");
//    }

    /*******************************第三次*************************************************/
    //添加 FlyBehavior  QuackBehavior 属行
    //这样来说 每次鸭子有新行为只需要在这里添加一个接口
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    //去掉quack() 方法 和 fly() 方法
    //添加新的方法
    public void performQuack(){
        quackBehavior.quack();
    };

    public void performFly(){
        flyBehavior.fly();
    };


    /*************************第四次**************************************/
    //因为接口都是在下层实体类中进行实例话的 无法动态配置 修改起来很麻烦 比如有100个鸭子
    //新增两个方法 用来动态配置 目的就是为了可以修改
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
