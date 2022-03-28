package com.sjms.wq.工厂模式.demoone.bo;

import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.cheeses.Cheese;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.clams.Clams;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.doughs.Dough;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.pepperonis.Pepperoni;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.sauce.Sauce;
import com.sjms.wq.工厂模式.demoone.bo.pizzaIngredientFactorys.veggies.Veggies;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 世墨
 * @Date: 2022/3/11 19:45
 * @DESCRIPTION  披萨类
 */
public abstract class Pizza {

    /**
     * 每一个披萨都应该具有名称，面团类型，酱类，一套佐料
     */
    /**
     * 姓名
     */
    private String name;
    /**
     * 面团
     */
    private Dough dough;

    /**
     * 酱
     */
    private Sauce sauce;
    /**
     * 一套佐料
     */
    private List<Veggies> toppings = new ArrayList();

    /**
     * 蛤蜊
     */
    private Clams clams;

    /**
     * 意大利香肠
     */
    private Pepperoni pepperoni;

    /**
     * 奶酪
     */
    private Cheese cheese;

    /**
     * 披萨的准备工作
     */
    public abstract void prepare();

    public void bake(){
        System.out.println("烘烤开始！！！");
    }

    public void cut(){
        System.out.println("切披萨开始！！！！");
    }

    public void box(){
        System.out.println("包装开始！！！！");
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public List<Veggies> getToppings() {
        return toppings;
    }

    public void setToppings(List<Veggies> toppings) {
        this.toppings = toppings;
    }

    public Clams getClams() {
        return clams;
    }

    public void setClams(Clams clams) {
        this.clams = clams;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    /**
     * 打印披萨的信息
     */
    public void toInformation(){
     System.out.println("preparing 工厂开始加工披萨：" + name);
     System.out.println("tossing dough...");
     dough.out();
     System.out.println("tossing sauce...");
     sauce.out();
     System.out.println("tossing clams...");
     clams.out();
     System.out.println("tossing pepperoni...");
     pepperoni.out();
     System.out.println("tossing cheese...");
     cheese.out();
     System.out.println("adding toppings..." );
     toppings.forEach(Veggies::out);
    }
}
