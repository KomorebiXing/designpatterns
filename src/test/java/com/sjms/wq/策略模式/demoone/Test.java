package com.sjms.wq.策略模式.demoone;

import com.sjms.wq.策略模式.demoone.bo.Duck;
import com.sjms.wq.策略模式.demoone.bo.MallardDuck;
import com.sjms.wq.策略模式.demoone.bo.ModelDuck;
import com.sjms.wq.策略模式.demoone.bo.RedheadDuck;
import com.sjms.wq.策略模式.demoone.bo.RubberDuck;
import com.sjms.wq.策略模式.demoone.interfaces.iml.FlyRocketPowered;

/**
 * @Author: 世墨
 * @Date: 2022/2/16 10:49
 * @DESCRIPTION 测试鸭子
 */
public class Test {

    //第一次：基础需求 需要鸭子会叫 会游泳 并且每个鸭子的外形不同
    @org.junit.jupiter.api.Test
    void test_duck_basic_skills(){
        final Duck mallardDuck = new MallardDuck();
        final Duck redheadDuck = new RedheadDuck();
//        mallardDuck.quack();//嘎嘎
//        mallardDuck.swim();//游泳
//        mallardDuck.display();//我是绿头
//        redheadDuck.quack();//嘎嘎
        redheadDuck.swim();//游泳
        redheadDuck.display();//我是红头
    }

    //第二次：需求增加 希望给鸭子添加飞的行为 新增橡皮鸭子
    /**
     * 此时出现问题，橡皮鸭子 不是活的 ，不可以进行飞行，但是因为继承了超类出现飞行的情况，导致出现bug
     * 解决办法 可以将橡皮鸭子的fly方法重写
     * 但还是会存在问题：比如这个时候有新的鸭子过来了 是个诱饵鸭子 它既不会飞也不会叫 ————>这个时候 如果每次有新的鸭子出现那么我们都要被迫检查并可能需要覆盖fly()和queark().....
     * 这会导致，非常的复杂，需要一个清晰的方法，让“某些”鸭子类型可飞或者可叫
     */
    @org.junit.jupiter.api.Test
    void test_duck_fly(){
        final Duck mallardDuck = new MallardDuck();
        final Duck redheadDuck = new RedheadDuck();
        final Duck rubberDuck = new RubberDuck();//橡皮鸭子
//        mallardDuck.fly();
//        redheadDuck.fly();
//        rubberDuck.fly();//飞啊飞啊飞啊~
    }

    //第三次：利用接口进行优化 分开变化和不会变化的部分 设计鸭子的行为  引出第一个设计原则：针对接口编程，而不是针对实现编程
    //新增接口：FlyBehavior 和 QuackBehavior
    //新增类： FlyWithWings(实现鸭子飞行) 和 FlyNoWay(什么都不做不进行飞行)实现接口 FlyBehavior
    //新增类： Quck(嘎嘎叫) 和 Squeak(叽叽叫) 和 MuteQuck(不会叫) 实现接口 QuackBehavior
    //这样设计 可以让飞行和呱呱叫的动作被其他的对象复用，因为这些行为以及和鸭子类无关了，也不会影响到飞行行为的鸭子类
    //在超类中加入 FlyBehavior  QuackBehavior 属性
    //以及需要在子类的构造方法中添加注入接口的实现类
    @org.junit.jupiter.api.Test
    void test_duck_interface(){
        final Duck mallardDuck = new MallardDuck();//绿色鸭子
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        final RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }

    //第四次：因为行为是在构造器里 具体实例化的 这会导致很死帮，如果后续有需求需要改变这个行为就变的很难受了 无法动态的进行配置
    //解决方案：提供两个新的方法 进行动态配置
    //新增需求 新增一个模板鸭子 ModelDuck 开始是不会飞的会叫，但是后续 需求提供 要求 会飞并且是 火箭动力的飞行（FlyRocketPowered）
    @org.junit.jupiter.api.Test
    void test_duck_interface_dynamic(){
        final Duck modelDuck = new ModelDuck();//模板鸭子
        modelDuck.display();
        modelDuck.performFly();
        System.out.println("修改了飞行的行为");
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }


    /***
     * 总结：以上就是一个策略模式的例子
     * 1.从中可以看出三个设计原则
     *   原则：
     *      1.找出应用中可能需要变化之处，把他们独立出来，不要和那些不需要变化的代码混合在一起
     *      2.针对接口编程，而非针对实现编程
     *      3.多用组合，少用继承
     * 2.介绍一下策略模式：策略模式定义了算法簇，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于使用算法的客户
     *
     * 3.本次用例是通过 接口来分离 上下级的关系，使得上级不要关心下级，下级不要关心上级，利用多态 继承的方式完成了这巧妙的应用。
     */
}
