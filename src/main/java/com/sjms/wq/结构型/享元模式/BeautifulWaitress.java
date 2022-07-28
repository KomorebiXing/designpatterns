package com.sjms.wq.结构型.享元模式;

/**
 * <p>
 * 具体享元类
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 17:42
 */
public class BeautifulWaitress extends AbstractWaitressFlyweight{


    private String id; // 工号
    private String name; // 姓名
    private int age; // 年龄

    private boolean canService = true; //能否服务

    public BeautifulWaitress(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    @Override
    void service() {
        System.out.println("工号: " + id  + " 姓名: " + name + " 正在为你服务.....");
        canService = false;
    }

    @Override
    void end() {
        System.out.println("工号: " + id  + " 姓名: " + name + " 服务结束.....");
        canService = true;
    }
}
