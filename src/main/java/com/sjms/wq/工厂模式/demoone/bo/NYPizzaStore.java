package com.sjms.wq.工厂模式.demoone.bo;

import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.NYPizzaIngredientFaactory;
import com.sjms.wq.工厂模式.demoone.bo.simplepizzafactorys.ChesssePizza;
import com.sjms.wq.工厂模式.demoone.bo.simplepizzafactorys.ClamPizza;
import com.sjms.wq.工厂模式.demoone.bo.simplepizzafactorys.PepperoniPizza;
import com.sjms.wq.工厂模式.demoone.interfaces.PizzaIngredientFactory;

/**
 * @Author: 世墨
 * @Date: 2022/3/15 18:45
 * @DESCRIPTION 纽约披萨店
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza =  null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFaactory();
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
