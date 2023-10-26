package com.sjms.wq.solid.里氏替换原则;

/**
 * 里氏替换原则：子类可以替代父类进行工作,同时子类可以增加父类的方法
 */
public class Father {


    public void makeMoney(int override){
        System.out.println("挣钱了"  + override);
    }

}
