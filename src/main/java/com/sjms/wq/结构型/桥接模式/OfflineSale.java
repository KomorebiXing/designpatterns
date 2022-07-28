package com.sjms.wq.结构型.桥接模式;

/**
 * <p>
 *  线下渠道 //以后有其他渠道直接扩展渠道 每个单独的渠道还可以写优惠政策
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 10:37
 */
public class OfflineSale extends AbstractSale{
    OfflineSale(String type, Integer price) {
        super(type, price);
    }
}
