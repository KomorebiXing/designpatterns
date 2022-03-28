package com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys;

import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.cheeses.Cheese;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.cheeses.RggianoCheese;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.clams.Clams;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.clams.FreshClams;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.doughs.Dough;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.doughs.ThinCrustDough;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.pepperonis.Pepperoni;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.pepperonis.SlicedPepperoni;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.sauce.MarinaraSauce;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.sauce.Sauce;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.veggies.Garlic;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.veggies.Mushroom;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.veggies.Onion;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.veggies.RedPepper;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.veggies.Veggies;
import com.sjms.wq.工厂模式.demoone.interfaces.PizzaIngredientFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 世墨
 * @Date: 2022/3/15 16:36
 * @DESCRIPTION 纽约区域工厂类：这个工厂精于大蒜番茄酱料，Reggiano干酪 新鲜蛤笠。。。。
 */
public class NYPizzaIngredientFaactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        //薄皮面团
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        //意大利西红柿酱
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        //雷吉亚诺奶酪
        return new RggianoCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        ArrayList<Veggies> veggies = new ArrayList<>();
        //蒜
        veggies.add(new Garlic());
        //洋葱
        veggies.add(new Onion());
        //蘑菇
        veggies.add(new Mushroom());
        //辣椒
        veggies.add(new RedPepper());
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        //意大利辣香肠片
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        //新鲜蛤蜊
        return new FreshClams();
    }
}
