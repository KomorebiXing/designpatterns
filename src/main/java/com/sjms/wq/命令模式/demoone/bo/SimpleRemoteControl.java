package com.sjms.wq.命令模式.demoone.bo;

import com.sjms.wq.命令模式.demoone.interfaces.Command;

/**
 * @Author: 世墨
 * @Date: 2022/3/27 13:29
 * @DESCRIPTION 简单的远程控制 遥控器测试
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    /**
     * 输入命令
     * @param command
     */
    public void setCommand(Command command){
        slot = command;
    }

    /**
     * 执行命令
     */
    public void  buttonWasPressed(){
        slot.execute();
    }
}
