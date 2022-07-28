package com.sjms.wq.结构型.代理模式;

import com.sjms.wq.结构型.代理模式.cglib.CglibLeiTikTok;
import com.sjms.wq.结构型.代理模式.cglib.CglibProxy;
import com.sjms.wq.结构型.代理模式.dynamic.JDKLeiTikTok;
import com.sjms.wq.结构型.代理模式.dynamic.JDKTiktokProxy;
import com.sjms.wq.结构型.代理模式.dynamic.SellTikTok;
import com.sjms.wq.结构型.代理模式.statics.LeiTikTok;
import com.sjms.wq.结构型.代理模式.statics.TiktokProxy;
import com.sjms.wq.结构型.装饰对象模式.demothree.ManTikTok;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 14:03
 */
public class Test {

    @org.junit.jupiter.api.Test
    //静态代理就是装饰器 装饰器是代理模式的一种
    void static_test(){
        final TiktokProxy tiktokProxy = new TiktokProxy(new LeiTikTok());
        tiktokProxy.tiktok();
    }

    @org.junit.jupiter.api.Test
    //动态代理 必须要实现接口
    void JDK_test(){
        final SellTikTok jdkLeiTikTok = new JDKLeiTikTok();
        //注意一定要是接口 不然会报错
        final SellTikTok proxy = JDKTiktokProxy.getProxy(jdkLeiTikTok);
        proxy.sell();
    }

    @org.junit.jupiter.api.Test
    //Cglib代理
    void cglib_test(){
        final CglibLeiTikTok proxy = CglibProxy.createProxy(CglibLeiTikTok.class);
        proxy.tiktok();
    }

}
