package com.sjms.wq.结构型.享元模式;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 17:39
 */
public abstract class AbstractWaitressFlyweight {

    /**
     * 正在服务  享元的不可共享属性留给外部进行改变的接口
     */
    abstract void service();

    /**
     * 服务完成  享元的不可共享属性留给外部进行改变的接口
     */
    abstract void end();

    /**
     * 是否能服务
     * @return
     */
    abstract boolean isCanService();

}
