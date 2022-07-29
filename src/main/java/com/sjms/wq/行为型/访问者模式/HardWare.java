package com.sjms.wq.行为型.访问者模式;

/**
 * <p>
 * 硬件 抽象元素
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 16:15
 */
public abstract class HardWare {

    /**
     * 封装硬件的处理指令
     */
    String command;

    public HardWare(String command) {
        this.command = command;
    }

    /**
     * 收到命令以后进行工作
     */
    public void work(){
        System.out.println(command);
    }

    /**
     * 定义接收软件升级包的方法，这个方法应该具体硬件去实现
     * @param vistor
     */
    public abstract void accept(Vistor vistor);
}
