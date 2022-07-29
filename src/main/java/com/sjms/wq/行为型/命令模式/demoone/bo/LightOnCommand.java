package com.sjms.wq.行为型.命令模式.demoone.bo;

import com.sjms.wq.行为型.命令模式.demoone.interfaces.Command;

/**
 * @Author: 世墨
 * @Date: 2022/3/27 13:19
 * @DESCRIPTION 打开电灯的命令
 */
public class LightOnCommand implements Command {

    Light light;

    /**
     * 构造器被传入就了某个电灯(比如，客厅的电灯) 以便让这个命令控制，然后记录在实例变量中
     * 一旦调用execute(),就由这个电灯对象成为对象者，负责接收请求
     * @param light
     */
    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
