package com.sjms.wq.行为型.命令模式.demoone.interfaces;

/**
 * @Author: 世墨
 * @Date: 2022/3/27 13:17
 * @DESCRIPTION 命令接口
 */
public interface Command {
    /**
     * 执行方法
     */
    void execute();

    /**
     * 撤销方法
     */
    void undo();
}
