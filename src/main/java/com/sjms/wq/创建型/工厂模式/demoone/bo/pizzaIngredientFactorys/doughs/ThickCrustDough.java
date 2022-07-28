package com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys.doughs;

/**
 * @Author: 世墨
 * @Date: 2022/3/15 16:53
 * @DESCRIPTION 厚皮面团
 */
public class ThickCrustDough extends Dough {
    @Override
    public void out() {
        System.out.println("厚皮面团安装!!!");
    }
}
