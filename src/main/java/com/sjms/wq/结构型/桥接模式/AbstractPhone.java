package com.sjms.wq.结构型.桥接模式;

/**
 * <p>
 * 1.抽象手机类 手机抽象化
 * 手机有各种销售渠道价格都不一样
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 10:11
 */
public abstract class AbstractPhone {

    //真正会引起此类变化的一个维护直接抽取出来，通过组合的方式接起来 就是桥接
    //桥接 + 适配器 更加强大 目前不理解
    AbstractSale sale;//分离渠道（桥接的关注点）

    //可以拿到当前手机的描述
    abstract String getPhone();

    public void setSale(AbstractSale sale){
        this.sale = sale;
    }
}
