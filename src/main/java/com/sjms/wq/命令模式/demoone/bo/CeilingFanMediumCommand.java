package com.sjms.wq.命令模式.demoone.bo;

import com.sjms.wq.命令模式.demoone.interfaces.Command;

/**
 * @Author: 世墨
 * @Date: 2022/3/29 20:05
 * @DESCRIPTION
 */
public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    //用于存储上一次的速度
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }


    @Override
    public void execute() {
        System.out.println("中转速打开");
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
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
