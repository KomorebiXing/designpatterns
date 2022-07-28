package com.sjms.wq.结构型.代理模式.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * <p>
 * 测试 {@link com.sjms.wq.结构型.代理模式.Test#cglib_test()}
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 15:42
 */
public class CglibProxy {

    public static <T> T createProxy(Class t) {
        //1.创建一个增强器
        final Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(t);
        //3.调用方法回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(
                    Object o,
                    Method method, // 获取源方法的信息
                    Object[] objects,
                    MethodProxy methodProxy)
                    throws Throwable {
                System.out.println("拦截开始喽");
                //调用父类的方法 invokeSuper
                final Object invoke = methodProxy.invokeSuper(o, objects);
                System.out.println("拦截结束喽");
                return invoke;
            }
        });
        return (T) enhancer.create();
    }
}
