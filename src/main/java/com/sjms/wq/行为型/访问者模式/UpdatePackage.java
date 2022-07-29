package com.sjms.wq.行为型.访问者模式;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 16:18
 */
public class UpdatePackage implements Vistor{

    @Override
    public void visitDisk(HardWare vistor) {
        vistor.command = "升级啦";
    }

    @Override
    public void visitCPU(HardWare vistor) {
        vistor.command = "升级啦";
    }
}
