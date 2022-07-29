package com.sjms.wq.行为型.命令模式.demotwo;

/**
 * <p>
 * 抽象命令类
 * Controller、Service、Dao接口
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 15:03
 */
public interface Command {

    /**
     * 命令的执行方法
     */
    void execute();

}
