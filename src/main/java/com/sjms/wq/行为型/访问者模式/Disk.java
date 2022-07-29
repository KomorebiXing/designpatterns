package com.sjms.wq.行为型.访问者模式;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 16:17
 */
public class Disk extends HardWare {

    public Disk(String command) {
        super(command);
    }

    @Override
    public void work() {
        System.out.println("Disk" + command);
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.visitDisk(this);
    }
}
