package com.sjms.wq.结构型.桥接模式;

/**
 * <p>
 * 手机渠道抽象化
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 10:12
 */
public abstract class AbstractSale {

    private final String type;

    private final Integer price;

    AbstractSale(String type, Integer price) {
        this.type = type;
        this.price = price;
    }

    String getSalePrice(){
        return type + price;
    }
}
