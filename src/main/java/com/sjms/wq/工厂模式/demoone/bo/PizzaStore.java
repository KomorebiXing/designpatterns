package com.sjms.wq.工厂模式.demoone.bo;

/**
 * @Author: 世墨
 * @Date: 2022/3/14 19:33
 * @DESCRIPTION  披萨店
 */
public abstract class PizzaStore {

    /**
     * 订购 披萨
     * @param type
     * @return
     */
        public Pizza orderPizza(String type){
        Pizza pizza;
        pizza  = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 创建pizza
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
