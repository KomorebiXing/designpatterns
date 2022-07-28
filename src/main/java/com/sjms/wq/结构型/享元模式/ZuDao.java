package com.sjms.wq.结构型.享元模式;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 * <p>
 * 足疗店，这相当为一个享元工厂类，店里面有很多的服务员
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 17:42
 */
public class ZuDao {

    private ZuDao() {
    }

    /**
     * 可以理解为 这是一个池子 用于存储该店的服务员 key为服务员的员工号 value为具体员工
     */
    private static Map<String, AbstractWaitressFlyweight> pool = new HashMap<>();

    /**
     * 享元  池子中已经有一些对象  就像是 线程池中 初始化的一些线程一样
     */
    static {
        BeautifulWaitress beautifulWaitress1 = new BeautifulWaitress(UUID.randomUUID().toString(), "王波", 20);
        BeautifulWaitress beautifulWaitress2 = new BeautifulWaitress(UUID.randomUUID().toString(), "王钰", 25);
        BeautifulWaitress beautifulWaitress3 = new BeautifulWaitress(UUID.randomUUID().toString(), "小家伙", 24);
        BeautifulWaitress beautifulWaitress4 = new BeautifulWaitress(UUID.randomUUID().toString(), "王鑫", 26);
        pool.put(beautifulWaitress1.getId(), beautifulWaitress1);
        pool.put(beautifulWaitress2.getId(), beautifulWaitress2);
        pool.put(beautifulWaitress3.getId(), beautifulWaitress3);
        pool.put(beautifulWaitress4.getId(), beautifulWaitress4);
    }

    /**
     * 添加服务员工
     *
     * @param abstractWaitressFlyweight 抽象的员工类
     */
    public static void addWaitress(AbstractWaitressFlyweight abstractWaitressFlyweight) {
        pool.put(UUID.randomUUID().toString(), abstractWaitressFlyweight);
    }

    /**
     * 删除员工
     */
    public static void deleteWaitress(String id) {
        pool.remove(id);
    }

    /**
     * 获取服务员
     *
     * @return
     */
    public static AbstractWaitressFlyweight getWaitress(String id) {
        return Optional.ofNullable(pool.get(id)).orElseGet(() ->
                pool.values().stream().filter(AbstractWaitressFlyweight::isCanService).findFirst().orElseThrow(() -> new IllegalAccessError("没有可用的服务员"))
        );
    }
}
