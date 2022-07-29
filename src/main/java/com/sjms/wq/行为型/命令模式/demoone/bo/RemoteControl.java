package com.sjms.wq.行为型.命令模式.demoone.bo;

import com.sjms.wq.行为型.命令模式.demoone.interfaces.Command;

/**
 * @Author: 世墨
 * @Date: 2022/3/27 14:23
 * @DESCRIPTION 遥控器
 */
public class RemoteControl {
    Command[] onCommand;
    Command[] offCommand;
    Command undoCommand;

    public RemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];

        Command noCommand = new Nocommand();
        for (int i = 0; i < 7; i++) {
            onCommand[i] = noCommand;
            offCommand[i] =noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot,Command  onCommand, Command  offCommand){
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommand[slot].execute();
        undoCommand = onCommand[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommand[slot].execute();
        undoCommand = offCommand[slot];
    }

    public void undoButtonWasPushed(){
        System.out.print("撤销动作:现在状态为    ");
        undoCommand.undo();
    }

    @Override
    public String toString(){
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("加载类如下：********************* \n");
        for (int i = 0; i < onCommand.length; i++) {
            stringBuffer.append("[slot  " + i + " ]" + onCommand[i].getClass().getName() + "    "+ offCommand[i].getClass().getName() + "\n");
        }
        stringBuffer.append("[undo] " + undoCommand.getClass().getName() );
        return stringBuffer.toString();
    }

}
