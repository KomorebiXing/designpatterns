package com.sjms.wq.结构型.适配器模式;

import com.sjms.wq.结构型.适配器模式.demoone.TurkeyAdapter;
import com.sjms.wq.结构型.适配器模式.demoone.bo.MallardDuck;
import com.sjms.wq.结构型.适配器模式.demoone.bo.WildTurkey;
import com.sjms.wq.结构型.适配器模式.demoone.interfaces.Duck;
import com.sjms.wq.结构型.适配器模式.demoone.interfaces.Turkey;
import com.sjms.wq.结构型.适配器模式.demothrer.MoviePlayer;
import com.sjms.wq.结构型.适配器模式.demothrer.adapter.JPMoviePlayerAdapter;
import com.sjms.wq.结构型.适配器模式.demothrer.adapter.Zh_JPTranslator;
import com.sjms.wq.结构型.适配器模式.demotwo.bo.Amplifler;
import com.sjms.wq.结构型.适配器模式.demotwo.bo.DdPlayer;
import com.sjms.wq.结构型.适配器模式.demotwo.bo.DvdPlayer;
import com.sjms.wq.结构型.适配器模式.demotwo.bo.HomeTheaterFacade;
import com.sjms.wq.结构型.适配器模式.demotwo.bo.PopcomPopper;
import com.sjms.wq.结构型.适配器模式.demotwo.bo.Projector;
import com.sjms.wq.结构型.适配器模式.demotwo.bo.Screen;
import com.sjms.wq.结构型.适配器模式.demotwo.bo.TheaterLights;
import com.sjms.wq.结构型.适配器模式.demotwo.bo.Tuner;

/**
 * @Author: 世墨
 * @Date: 2022/4/6 11:22
 * @DESCRIPTION 适配器模式和外观模式
 *
 * 目的：还记得之前装饰者模式，是怎么样的吗？ 装饰着模式是将对象包装起来，赋予他们新的职责
 * 而现在贼似以往不同目的，包装某些对象：让他们的接口看起来不像自己而像是别的东西。
 * 为何这么做?
 * 因为这样就可以在设计中，将类的接口转换成想要的接口，以便实现不同的接口。
 *
 * 现实中的适配器
 * OO适配器，比如说，笔记本电脑，在欧洲国家和美国国家中，需要一个交流电的适配器
 * 而这个交流电的适配器的作用就是: 它位于美式插头和欧式插头的中间，他的工作是将欧式插座转换成美式插座，好让美式插头可以插进这个插座得到电力。
 * 或者可以这么认为：它的任务就是改变插座的接口，以符合没事笔记本电脑的需求
 *
 * 其实OO适配器就是：将一个接口转换成另一个接口，以符合客户的期望
 *
 *      * 例子：
 *      * 假设已有一个软件系统，你希望它能和一个新的厂商类库搭配使用，但是这个新厂商所设计出来的接口，不同于旧厂家的接口
 *      * 你不想改变现有的代码，解决这个问题，只能重新写一个类，将厂家接口转换成你所期望的接口
 *      *
 *      * 也就是设配器，说它是设配器不如说它是一个中间人，它将客户所发出的请求转换成厂商类所能理解的请求
 *
 * 适配器定义：将一个类的接口，转换成客户期望的另一个接口，适配器让原本接口不兼容的类可以合作无间
 * 外观模式 ： 提供了一个统一的接口，用来访问子系统中的一群接口，外观定义了一个高层接口，让子系统更容易使用  (最少知道原则)
 */
public class Test {

    /**     * 简单的例子： Demoone
     *  假设我们有个鸭子的接口Duck 其中对应两个方法 quack()呱呱叫   fly()飞行
     *  但是现在有一个街头顽禽接口 Turkey ，其中对应两个方法 gobble 咯咯叫 fly()飞行 因为是火鸡，所有飞不远
     *
     *  现在是 你缺鸭子对象，想用一些火鸡对象来冒充，如何做？ 因为火鸡的接口不同，所有我们不能公然哪来用
     *  其实就需要写一个适配器

     */
    @org.junit.jupiter.api.Test
    void test_turkey_adapter_duck(){
        final Duck mallardDuck =  new MallardDuck();
        //火鸡
        final Turkey wildTurkey = new WildTurkey();
        //适配器  将火鸡伪装成 鸭子
        final Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\n这是鸭子");
        testDuck(mallardDuck);

        System.out.println("\n这是火鸡");
        testDuck(turkeyAdapter);
    }

    public void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

    /**
     * 例子二 ： demoTwo
     * 适配器模式解析: 其实就是 客户   适配器  被适配者 三者之间的关系
     * 1.客户通过目标接口调用适配器的方法 对适配器发出请求
     * 2.适配器使用被适配者接口吧请求转换成被适配者的一个或多个调用接口
     * 3.客户接收到调用的结果，但并未察觉这一切是适配器在起到转换作用
     *
     * 备注：客户 和 被是适配者是解耦的一个不知道另一个
     *
     * 一个适配只能封装一个类吗?
     * 适配器模式的工作是将一个接口转换为另一个接口，虽然大多数的适配器所采取的例子都是让一个适配器包装一个被适配器，但是我们知道这个时间要复杂很多
     * ，所有需要让一个适配器包装多个被适配者，这涉及到另一个模式，被称为 ————————> 外观模式
     *
     * 万一我的系统中新旧并存，旧的部分期望旧的厂商接口，但我们却已经使用新厂商的接口编写了这一部分，这个时候改怎么办?这里使用适配器
     * 那里却使用未包装的接口，这实在让人感到混乱，如果只是固守着旧的代码，完全不要管适配器，这样会不会好一些？
     * 不需要如此，可以创建一个  双向的适配器 支持两边的接口，想要创建一个 双向的适配器，就必须实现所涉及的两个接口，这样，这个适配器可以当作旧的接口，或者做新的接口使用
     *
     * 这个适配器模式充满着良好的OO设计原则，使用对象组合，以修改的接口包装被适配者；这中做法还有额外的优点，那就是，被适配者的任何子类，都可以搭配适配器使用
     * 需要注意：
     *    这个模式是如何把客户和接口绑定起来，而不是和实现绑定起来的。我们可以使用数个适配器，每一个都赋值转换不同组的后台类，或者，也可以加上新的实现，只要他们遵守目标接口就可以
     *
     * 其实适配器分为两种：(扩展)
     *  例子1是 对象适配器，还有一种是类适配器，因为此适配器只能重继承才能实现它，这在java中是不可能的
     *
     *  现在看看真实世界的适配器：
     *
     *  旧世界的枚举器:
     *  如果你已经使用过java，可还记得早期的结合类型都实现了一个名为elements()的方法，该方法会返回一个Enumeration，这Enumeration接口可以逐一走过此集合的每个元素，而无需知道他们在集合内是如何被管理的
     *
     *  新世界的迭代器:
     *  当sun推出更新后的集合类时，开始使用了 Iteraoe (迭代器)接口，这个接口和枚举接口很像，都可以让你遍历此集合类型的内的每个元素，但是不同的是，迭代器提供了删除元素的能力
     *
     *  现在有一个问题，思考？ 面对之前遗留代码，这些代码暴露出枚举器接口，但我们又希望在新的代码中只使用迭代器，该如何解决
     *
     *  解决方案：
     *   相信你也知道，其实就是写一个适配器，利用组合的方式去做，而对于迭代器中的删除，枚举器是无法做到的，可以选择抛出异常，这个是无法避免的，需要在文档注释清除，来避免调用者出现这样的错误
     *
     *  装饰者 和 适配者 外观模式的区别
     *  装饰者：不改变接口，但加入责任
     *  适配者：将一个接口转成另一个接口
     *  外观模式：用于简化接口
     *
     *  说了这多，先来看看外观模式把
     *  例子：
     *    甜蜜的家庭影院，通过一番研究笔记，你需要组装一套杀手级的i系统，内含DVD播放器，投影机，自动屏幕，环绕立体声，甚至还有爆米花机
     *
     *   但是你要观赏电影 必须先执行一些任务
     *
     *   1.打开爆米花机
     *   2.开始爆米花
     *   3.将灯光调暗
     *   4.放下屏幕
     *   5.打开投影机h
     *   6.将投影机输入切换到DVD
     *   7.将投影机设置在宽屏模式
     *   8.打开功放
     *   9.将攻放的输入设置为 DVD
     *   10.将功放设置为环绕立体声
     *   11.将功放音量调到中(5)
     *   12.打开DVD播放器
     *   13.开始播放DVD
     *
     *   而以上的任务都在不同的类里面，调用起来很麻烦，同时如果你看完了，你还要把一切都关掉，难道要反向走一边????
     *
     *   这个时候你就可以使用外观模式了，将一切变的简单。
     *
     *   外观只是提供了你更直接的操作，并未将原来的子系统阻隔起来，如果你需要子系统类的更高层功能，还是可以使用原来子系统的
     *   只需要提供一个外观类即可，将一些操作封装起来，调用即可达到 一键傻瓜式操作
     */
    @org.junit.jupiter.api.Test
    void test_movie(){
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        DdPlayer ddPlayer = new DdPlayer();
        //外观者模式
        final HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifler(tuner,dvdPlayer,ddPlayer),
                tuner,
                dvdPlayer,
                ddPlayer,
                new Projector(),
                new TheaterLights(),
                new Screen(),
                new PopcomPopper()
                );

        homeTheaterFacade.wathMovie("和平精英");
        homeTheaterFacade.endMovie();
    }

    @org.junit.jupiter.api.Test
    void movie_test() {
        //正常想看电影
        System.out.println("/****************正常输出***********************/");
        final MoviePlayer moviePlayer = new MoviePlayer();
        System.out.println(moviePlayer.play());
        System.out.println("/****************适配器输出***********************/");
        //如果小日子过的不错的日本人想看电影 通过继承可以做到  public class JPMoviePlayerAdapter extends Zh_JPTranslator
//        final JPMoviePlayerAdapter jpMoviePlayerAdapter = new JPMoviePlayerAdapter(moviePlayer);
//        System.out.println(jpMoviePlayerAdapter.play());

        //通过对象组合的方式 也可以 一般倾向于 组合使用
        final JPMoviePlayerAdapter jpMoviePlayerAdapter = new JPMoviePlayerAdapter(moviePlayer);
        jpMoviePlayerAdapter.setTranslator(new Zh_JPTranslator());
        System.out.println(jpMoviePlayerAdapter.play());
    }

    /**
     * 备注：最少知道原则
     *  要想使用最少知道原则，需要知道，这个原则不可以乱使用，不然就会出现赢得太多的朋友和影响太多的对象
     *  而针对这个原则提供了方针(范围)：
     *  1.该对象本身
     *  2.被当做方法的参数而传递进来的对象
     *  3.此方法所创建或实例化的任何对象
     *  4.对象的任何组件
     *
     *  缺点：虽然这个原则减少了对象之间的依赖，研究现实这个会减少软件的维护成本，但是采用这个原则也会导致更多的 包装 类被制造出来，以处理和其他的组件的沟通，这可能会导致复杂度和开发使劲按的增加，并减低运行时的性能
     */
}
