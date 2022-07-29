package com.sjms.wq.行为型.访问者模式;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 16:17
 */
public interface Vistor {

    void visitDisk(HardWare vistor);

    void visitCPU(HardWare vistor);
}
