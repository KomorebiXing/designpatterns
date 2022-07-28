package com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys;

import com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys.cheeses.Cheese;
import com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys.cheeses.Mozzarella;
import com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys.clams.Clams;
import com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys.clams.FrozenClams;
import com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys.doughs.Dough;
import com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys.doughs.ThickCrustDough;
import com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys.pepperonis.Pepperoni;
import com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys.pepperonis.SlicedPepperoni;
import com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys.sauce.PlumTomatoSauce;
import com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys.sauce.Sauce;
import com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys.veggies.BlackOlives;
import com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys.veggies.EggPlant;
import com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys.veggies.Spinach;
import com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys.veggies.Veggies;
import com.sjms.wq.创建型.工厂模式.demoone.interfaces.PizzaIngredientFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 世墨
 * @Date: 2022/3/15 16:51
 * @DESCRIPTION 芝加哥比萨配料厂
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        //厚皮面团
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        //梅子番茄酱
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        //无盐奶酪
        return new Mozzarella();
    }

    @Override
    public List<Veggies> createVeggies() {
        ArrayList<Veggies> veggies = new ArrayList<>();
        //黑橄榄
        veggies.add(new BlackOlives());
        //菠菜
        veggies.add(new Spinach());
        //茄子
        veggies.add(new EggPlant());
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        //意大利辣香肠片
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        //冻蛤蜊
        return new FrozenClams();
    }
}
