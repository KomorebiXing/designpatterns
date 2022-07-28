package com.sjms.wq.结构型.享元模式;

/**
 * <p>
 * 具体享元类
 *
 * 测试 {@link com.sjms.wq.结构型.享元模式.Test#test()}
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean isCanService() {
        return canService;
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
