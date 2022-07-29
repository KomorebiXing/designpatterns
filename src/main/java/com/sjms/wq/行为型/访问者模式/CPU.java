package com.sjms.wq.行为型.访问者模式;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 16:17
 */
public class CPU extends HardWare{

    public CPU(String command) {
        super(command);
    }

    @Override
    public void work() {
        System.out.println("CPU" + command);
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.visitCPU(this);
    }
}
