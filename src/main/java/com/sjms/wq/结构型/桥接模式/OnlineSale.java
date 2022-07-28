package com.sjms.wq.结构型.桥接模式;

/**
 * <p>
 * 线上渠道
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 10:37
 */
public class OnlineSale extends AbstractSale{

    OnlineSale(String type, Integer price) {
        super(type, price);
    }
}
