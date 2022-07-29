package com.sjms.wq.行为型.模板方法模式.demotwo;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 8:55
 */
public class AutoCookMachine extends CookTemplate {

    @Override
    public void addFood() {
        System.out.println("加入辣椒");
        System.out.println("加入干子");
    }

    @Override
    public void addSalt() {
        System.out.println("放入一勺盐");
    }
}
