package com.sjms.wq.命令模式.demoone.bo;

import com.sjms.wq.命令模式.demoone.interfaces.Command;

/**
 * @Author: 世墨
 * @Date: 2022/3/27 14:44
 * @DESCRIPTION
 */
public class StereoOnCommend implements Command {

    Stereo stereo;

    public StereoOnCommend(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
