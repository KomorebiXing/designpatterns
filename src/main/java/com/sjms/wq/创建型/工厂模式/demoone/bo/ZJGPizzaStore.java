package com.sjms.wq.创建型.工厂模式.demoone.bo;

import com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys.ChicagoPizzaIngredientFactory;
import com.sjms.wq.创建型.工厂模式.demoone.bo.simplepizzafactorys.ChesssePizza;
import com.sjms.wq.创建型.工厂模式.demoone.bo.simplepizzafactorys.ClamPizza;
import com.sjms.wq.创建型.工厂模式.demoone.bo.simplepizzafactorys.PepperoniPizza;
import com.sjms.wq.创建型.工厂模式.demoone.interfaces.PizzaIngredientFactory;

/**
 * @Author: 世墨
 * @Date: 2022/3/15 19:11
 * @DESCRIPTION
 */
public class ZJGPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza =  null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")){
            pizza = new ChesssePizza(pizzaIngredientFactory);
        }else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza(pizzaIngredientFactory);
        }else if (type.equals("clam")){
            pizza = new ClamPizza(pizzaIngredientFactory);
        }
        return pizza;
    }
}
