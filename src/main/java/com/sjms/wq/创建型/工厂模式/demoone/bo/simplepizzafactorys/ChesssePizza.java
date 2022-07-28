package com.sjms.wq.创建型.工厂模式.demoone.bo.simplepizzafactorys;

import com.sjms.wq.创建型.工厂模式.demoone.bo.Pizza;
import com.sjms.wq.创建型.工厂模式.demoone.interfaces.PizzaIngredientFactory;

/**
 * @Author: 世墨
 * @Date: 2022/3/11 19:47
 * @DESCRIPTION
 */
public class ChesssePizza extends Pizza {
//    public ChesssePizza() {
//        List<String> list = new ArrayList<>();
//        super.setName("ChesssePizza");
//        super.setDough("Thin Crust Dogh");
//        super.setSauce("Marinara sausce");
//        list.add("辣酱酱");
//        super.setToppings(list);
//    }

    private PizzaIngredientFactory pizzaIngredientFactory;

    public ChesssePizza() {
    }

    public ChesssePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        super.setName("ChesssePizza");
        super.setDough(pizzaIngredientFactory.createDough());
        super.setSauce(pizzaIngredientFactory.createSauce());
        super.setCheese(pizzaIngredientFactory.createCheese());
        super.setToppings(pizzaIngredientFactory.createVeggies());
        super.setClams(pizzaIngredientFactory.createClams());
        super.setPepperoni(pizzaIngredientFactory.createPepperoni());
        super.toInformation();
    }
}
