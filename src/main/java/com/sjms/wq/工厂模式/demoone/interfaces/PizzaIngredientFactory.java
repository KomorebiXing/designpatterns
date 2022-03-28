package com.sjms.wq.工厂模式.demoone.interfaces;

import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.cheeses.Cheese;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.clams.Clams;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.doughs.Dough;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.pepperonis.Pepperoni;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.sauce.Sauce;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.veggies.Veggies;

import java.util.List;

/**
 * @Author: 世墨
 * @Date: 2022/3/15 15:49
 * @DESCRIPTION 原料工厂  如果里面存在某种机制需要实现，那么就将接口改为抽象类
 */
public interface PizzaIngredientFactory {
    /**
     * 创建面团
     * @return
     */
    Dough createDough();

    /**
     * 创建 酱料
     * @return
     */
    Sauce createSauce();

    /**
     *  创建 奶酪
     * @return
     */
    Cheese createCheese();

    /**
     * 创建 蔬菜
     * @return
     */
    List<Veggies> createVeggies();

    /**
     * 创建 意大利香肠切的方式
     * @return
     */
    Pepperoni createPepperoni();

    /**
     * 创建 蛤蜊
     * @return
     */
    Clams createClams();
}
