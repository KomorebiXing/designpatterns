package com.sjms.wq.工厂模式.demoone.bo.simplepizzafactorys;

import com.sjms.wq.工厂模式.demoone.bo.Pizza;
import com.sjms.wq.工厂模式.demoone.bo.PizzaStore;

/**
 * @Author: 世墨
 * @Date: 2022/3/11 19:44
 * @DESCRIPTION  简单工厂类
 */
public class SimplePizzaFactory extends PizzaStore {

    @Override
    public Pizza createPizza(String type){
        Pizza pizza =null;

        if (type.equals("cheese")){
            pizza = new ChesssePizza();
        }else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }else if (type.equals("clam")){
            pizza = new ClamPizza();
        }
        //one
//        pizza.getString();
//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();
        return pizza;
    }
}
