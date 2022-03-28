package com.sjms.wq.工厂模式.demoone.bo.simplepizzafactorys;

import com.sjms.wq.工厂模式.demoone.bo.Pizza;
import com.sjms.wq.工厂模式.demoone.interfaces.PizzaIngredientFactory;

/**
 * @Author: 世墨
 * @Date: 2022/3/11 19:49
 * @DESCRIPTION
 */
public class ClamPizza extends Pizza {
    private PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza() {
    }

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        super.setName("ClamPizza");
        super.setDough(pizzaIngredientFactory.createDough());
        super.setSauce(pizzaIngredientFactory.createSauce());
        super.setCheese(pizzaIngredientFactory.createCheese());
        super.setToppings(pizzaIngredientFactory.createVeggies());
        super.setClams(pizzaIngredientFactory.createClams());
        super.setPepperoni(pizzaIngredientFactory.createPepperoni());
        super.toInformation();
    }
}
