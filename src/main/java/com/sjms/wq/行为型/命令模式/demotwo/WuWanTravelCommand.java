package com.sjms.wq.行为型.命令模式.demotwo;

/**
 * <p>
 * 武汉出差命令
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 15:04
 */
public class WuWanTravelCommand implements Command{

    private LeiReceiver leiReceiver = new LeiReceiver();

    @Override
    public void execute() {
        System.out.println("武汉出差命令");
        leiReceiver.travel();
    }
}
