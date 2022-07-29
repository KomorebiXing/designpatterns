package com.sjms.wq.行为型.命令模式.demoone.bo;

import com.sjms.wq.行为型.命令模式.demoone.interfaces.Command;

/**
 * @Author: 世墨
 * @Date: 2022/3/28 17:58
 * @DESCRIPTION
 */
public class CeilingFanHighCommand implements Command {

    CeilingFan ceilingFan;
    //用于存储上一次的速度
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        System.out.println("高转速打开");
        //获取当前转速 存储
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH){
            System.out.println("回到高");
            ceilingFan.high();
        }else if (prevSpeed == CeilingFan.MEDIUM){
            System.out.println("回到中");
            ceilingFan.medium();
        }else if (prevSpeed == CeilingFan.LOW){
            System.out.println("回到低");
            ceilingFan.low();
        }else if (prevSpeed == CeilingFan.OFF){
            System.out.println("回到关");
            ceilingFan.off();
        }
    }
}
