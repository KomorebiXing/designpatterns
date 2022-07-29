package com.sjms.wq.行为型.命令模式.demotwo;

/**
 * <p>
 *在线命令
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 15:06
 */
public class OnlineCommand implements Command{

    private LeiReceiver leiReceiver = new LeiReceiver();

    @Override
    public void execute() {
        System.out.println("上课");
        leiReceiver.online();
    }
}
