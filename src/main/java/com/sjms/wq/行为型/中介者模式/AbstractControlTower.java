package com.sjms.wq.行为型.中介者模式;

/**
 * <p>
 * 控制塔 中介者
 * 如果没有台台 每次机长都要问 每个机长 我先走 你们停止 要维护所有飞机的启动和停止
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 11:09
 */
public abstract class AbstractControlTower {

    abstract void processor(AbstractCaptain abstractCaptain,String action);

}
