package com.sjms.wq.命令模式.demoone.bo;

/**Stereo
 * @Author: 世墨
 * @Date: 2022/3/27 14:44
 * @DESCRIPTION 音响
 */
public class Stereo {

    public void off() {
        System.out.println("音响关闭！！！");
    }

    public void on(){
        System.out.println("音响开启！！");
    }

    public void setCD(){
        System.out.println("设置CD！！");
    }

    public void setVolume(int i){
        System.out.println("设置音量为：" + i);
    }
}
