package com.sjms.wq.创建型.工厂模式.demoone.bo.simplepizzafactorys;

import com.sjms.wq.创建型.工厂模式.demoone.bo.Pizza;
import com.sjms.wq.创建型.工厂模式.demoone.interfaces.PizzaIngredientFactory;

/**
 * @Author: 世墨
 * @Date: 2022/3/11 19:47
 * @DESCRIPTION
 */
public class PepperoniPizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza() {
    }

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        super.setName("PepperoniPizza");
        super.setDough(pizzaIngredientFactory.createDough());
        super.setSauce(pizzaIngredientFactory.createSauce());
        super.setCheese(pizzaIngredientFactory.createCheese());
        super.setToppings(pizzaIngredientFactory.createVeggies());
        super.setClams(pizzaIngredientFactory.createClams());
        super.setPepperoni(pizzaIngredientFactory.createPepperoni());
        super.toInformation();
    }
}
