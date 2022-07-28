package com.sjms.wq.结构型.代理模式.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>
 * JDK提供了一个动态代理
 *
 * 代理对象喝目标对象的相同点都要实现同一个接口
 *
 * 测试 {@link com.sjms.wq.结构型.代理模式.Test#JDK_test()}
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 14:23
 */
public class JDKTiktokProxy<T> implements InvocationHandler {

    private T target;

    public JDKTiktokProxy(T target) {
        this.target = target;
    }

    /**
     * 获取代理对象 的 被代理对象
     * @param t
     * @param <T>
     * @return
     */
    public static<T> T getProxy(T t){
        /**
         * ClassLoader loader, 当前被代理对象的类加载器
         * Class<?>[] interfaces, 当前被代理对象所实现的接口
         * InvocationHandler h , 当前被代理对象 执行目标方法的时候 我们使用 h 可以拦截增加
         */
        return (T) Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(),
                new JDKTiktokProxy(t));
    }

    @Override
    /**
     * 定义目标方法的拦截逻辑,每个方法都会进来这里
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        final Object invoke = method.invoke(target,args);
        return invoke;
    }
}
