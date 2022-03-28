package com.sjms.wq.装饰对象模式.demoone.bo;

/**
 * @Author: 世墨
 * @Date: 2022/3/4 11:08
 * @DESCRIPTION  所有饮料的超类
 */
public abstract class Beverage {
    private String description =  "Unkonwn Beverage";

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();

}
