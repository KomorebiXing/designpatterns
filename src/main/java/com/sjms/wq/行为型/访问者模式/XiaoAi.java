package com.sjms.wq.行为型.访问者模式;


/**
 * <p>
 * 小爱机器人
 * 测试 {@link com.sjms.wq.行为型.访问者模式.Test#test()}
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 16:14
 */
public class XiaoAi {

    private CPU cpu = new CPU("武汉天气");

    private Disk disk = new Disk("武汉天气");


    /**
     * 回答问题
     */
    public void answerQuestion(){
        cpu.work();
        disk.work();
    }

    public void acceptUpdate(Vistor vistor) {
        vistor.visitCPU(cpu);
        vistor.visitDisk(disk);
    }
}
