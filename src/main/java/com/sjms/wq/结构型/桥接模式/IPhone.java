package com.sjms.wq.结构型.桥接模式;

/**
 * <p>
 * 苹果手机 //以后有其他手机直接扩宽类就好了
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 10:40
 */
public class IPhone extends AbstractPhone{

    private static final String INFO = "IPhone";


    @Override
    String getPhone() {
        return INFO + " 价格："+ sale.getSalePrice();
    }
}
