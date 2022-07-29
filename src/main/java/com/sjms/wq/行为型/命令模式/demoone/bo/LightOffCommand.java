package com.sjms.wq.行为型.命令模式.demoone.bo;

import com.sjms.wq.行为型.命令模式.demoone.interfaces.Command;

/**
 * @Author: 世墨
 * @Date: 2022/3/27 14:42
 * @DESCRIPTION  灯泡关指令
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
       this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
