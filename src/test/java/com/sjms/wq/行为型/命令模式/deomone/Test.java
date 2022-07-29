package com.sjms.wq.行为型.命令模式.deomone;

import com.sjms.wq.行为型.命令模式.demoone.bo.CeilingFan;
import com.sjms.wq.行为型.命令模式.demoone.bo.CeilingFanHighCommand;
import com.sjms.wq.行为型.命令模式.demoone.bo.CeilingFanMediumCommand;
import com.sjms.wq.行为型.命令模式.demoone.bo.CeilingFanOffCommand;
import com.sjms.wq.行为型.命令模式.demoone.bo.Light;
import com.sjms.wq.行为型.命令模式.demoone.bo.LightOffCommand;
import com.sjms.wq.行为型.命令模式.demoone.bo.LightOnCommand;
import com.sjms.wq.行为型.命令模式.demoone.bo.RemoteControl;
import com.sjms.wq.行为型.命令模式.demoone.bo.SimpleRemoteControl;
import com.sjms.wq.行为型.命令模式.demoone.bo.Stereo;
import com.sjms.wq.行为型.命令模式.demoone.bo.StereoOnCommend;
import com.sjms.wq.行为型.命令模式.demoone.bo.StreeoOffCommend;
import com.sjms.wq.行为型.命令模式.demoone.interfaces.Command;

/**
 * @Author: 世墨
 * @Date: 2022/3/27 12:38
 * @DESCRIPTION 命令模式 ：
 * 可以将动作的请求者和动作的执行者对象中解耦以
 * 将“请求”封装成对象，以便使用不同的请求，队列或者日志来参数化其他对象，命令模式也支持可撤/销的/操作
 */
public class Test {


    /**
     * 简单测试执行开灯命令操作
     */
    @org.junit.jupiter.api.Test
    void test_simple(){
        /**
         * 简单的控制器
         * 请求
         */
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        /**
         * 命令
         */
        Light light = new Light();
        /**
         * 传入命令
         */
        Command command = new LightOnCommand(light);
        simpleRemoteControl.setCommand(command);
        /**
         * 执行命令
         */
        simpleRemoteControl.buttonWasPressed();
    }

    /**
     * 测试命令模式里例子：遥控器模式
     */
    @org.junit.jupiter.api.Test
    void test_command_mode(){
        Light light = new Light();
        Stereo stereo = new Stereo();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOnCommend stereoOnCommend = new StereoOnCommend(stereo);
        StreeoOffCommend streeoOffCommend = new StreeoOffCommend(stereo);


        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);
        remoteControl.setCommand(1,stereoOnCommend,streeoOffCommend);
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);

        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        System.out.println(remoteControl);
    }

    /**
     * 命令模式带来的效果
     * 1.首先有个产品
     * 2.对每个产品提供了 控制的类 通过 注入的方式 调用每个产品独有的命令，比如开关之类的
     * 3.提供一个接口 目的 就是为每个命令的类 提供执行的方法 做到面向接口开发，不用关心下层是哪个产品
     * 4.提供一个 控制产品的工厂类，目的就是提供加入产品 ，提供方法是执行命令，利用多态，因为每个命令的类都去实现了接口
     *
     * 当然这里 只是利用遥控器 这个控制产品的工厂类就是一个遥控器 ，遥控器上面有开关按钮，遥控器可以控制很多的产品，比如电视，灯，空调，等待
     */
    @org.junit.jupiter.api.Test
    void test_the_fan(){
        RemoteControl remoteControl = new RemoteControl();
        final CeilingFan ceilingFan = new CeilingFan("电扇");

        final Command ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        final Command ceilingfanmediumcommand = new CeilingFanMediumCommand(ceilingFan);
        final Command ceilingfanoffcommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0,ceilingFanHighCommand,ceilingfanoffcommand);
        remoteControl.setCommand(1,ceilingfanmediumcommand,ceilingfanoffcommand);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);//高转速打开
        remoteControl.offButtonWasPushed(1);//关闭
//        remoteControl.undoButtonWasPushed();//回撤上一个动作
//        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(1);//中速打开
        remoteControl.undoButtonWasPushed();//回撤上一个动作
//        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);//高转速打开

        //遗留问题 ： 如果要运行多个指令组呢  宏命令

        //其实也很简单，重新写一个命令类去实现接口，类里面提供一个数组属性，提供一个set方法,然后循环去调用所有的命令即可 做到宏命令

        // 那撤销怎么做?  将顺序的数组 ，倒序循环调用就可以 撤销了
        

    }


    /**
     * 命令模式的更多用途：队列请求
     * 命令可以将运算块打包(一个接收这和一组动作),让后将它传来传去，就像是
     * 一般的对象一样。
     * 应用场景：日志安排，线程池，工作队列等
     *
     * 想象有一个工作对了，你在某一端添加命令，然后另一端则是现场，线程进行下面的动作，从对了中去除一个命令，调用它的execute()方法，等待这个调用完成，
     * 然后将此命令对象丢弃，再取出下一个命令。。。。。。
     *
     * 请注意：工作队列类和进行计算的对象之间完全是解耦的，此刻线程可能在进行财务运算，下一刻却再读取网络相数据，工作队列对象不在乎到底做些什么，
     * 他们只知道取出命令对象，然后调用其execute() 方法，他们只是实现模式的对象，就可以放入队列里，当线程可用时，就调用次对象的execute()方法
     *
     */

    /**
     * 日志请求:
     * 某些应用需要我们将所有的动作都纪录再日中，并能再系统死机之后，重新调用这些动作恢复到之前的状态。通过新增两个方法(store(),load（）)
     * ，命令模式就能支持这一点，再Java中，我们可以利用对象的序列化实现这些方法，但是一般认为序列化最好还是只用再对象的持久化上。
     * 要怎么做？
     * 当我们执行命令的时候，将历史记录存储在磁盘中，一旦系统死机，我们就可以将命令对象重新加载，并成批依次调用这些对象的execute()方法。
     * 这种日志的方式对于遥控器来说没有意义，然而，有许多调用大型数据库结构的动作的应用无法在每次改变发送时被快速存储，通过使用记录日志，我们可以将上次
     * 检查点之后的所有操作记录下来，如果系统出状况，从检查点开始应用这些操作。
     * 比如：对于电子表格应用，我们可能想要实现的错误恢复方式是将电子表哥的操作记录在日志种，而不是每次电子表哥一有变化就记录整个电子表哥。
     * 对更高级的应用而言，这些技巧可一被扩展应用到事务处理种，也就是说，一整群操作必须全部进行完成，或者没有进行任何操作。
     * */

}
