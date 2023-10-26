package com.sjms.wq.solid.里氏替换原则;

public class Son extends Father{

    /**
     * 子类可以将钱翻倍
     * @param override
     */
    @Override
    public void makeMoney(int override) {
        super.makeMoney(override * 2);
    }
}
