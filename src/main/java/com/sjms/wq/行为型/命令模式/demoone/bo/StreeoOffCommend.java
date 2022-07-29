package com.sjms.wq.行为型.命令模式.demoone.bo;

import com.sjms.wq.行为型.命令模式.demoone.interfaces.Command;

/**
 * @Author: 世墨
 * @Date: 2022/3/27 14:48
 * @DESCRIPTION
 */
public class StreeoOffCommend implements Command {

    Stereo stereo;

    public StreeoOffCommend(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
