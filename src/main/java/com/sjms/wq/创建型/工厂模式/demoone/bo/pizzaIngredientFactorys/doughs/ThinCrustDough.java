package com.sjms.wq.创建型.工厂模式.demoone.bo.pizzaIngredientFactorys.doughs;

/**
 * @Author: 世墨
 * @Date: 2022/3/15 16:46
 * @DESCRIPTION 薄皮面团
 */
public class ThinCrustDough extends Dough {
    @Override
    public void out() {
        System.out.println("薄皮面团安装!!!");
    }
}
