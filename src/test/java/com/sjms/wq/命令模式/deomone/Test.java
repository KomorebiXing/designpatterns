package com.sjms.wq.命令模式.deomone;

import com.sjms.wq.命令模式.demoone.bo.Light;
import com.sjms.wq.命令模式.demoone.bo.LightOffCommand;
import com.sjms.wq.命令模式.demoone.bo.LightOnCommand;
import com.sjms.wq.命令模式.demoone.bo.RemoteControl;
import com.sjms.wq.命令模式.demoone.bo.SimpleRemoteControl;
import com.sjms.wq.命令模式.demoone.bo.Stereo;
import com.sjms.wq.命令模式.demoone.bo.StereoOnCommend;
import com.sjms.wq.命令模式.demoone.bo.StreeoOffCommend;
import com.sjms.wq.命令模式.demoone.interfaces.Command;

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
        String LightString = "Light";
        String stereoString = "stereo";
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
        remoteControl.undoButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        System.out.println(remoteControl);
    }
}
