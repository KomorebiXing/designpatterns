package com.sjms.wq.solid.里氏替换原则;

public class Demo {

    public static void main(String[] args) {
        new Demo().makeMoney(new Father());
        new Demo().makeMoney(new Son());
    }

    public void makeMoney(Father father){
        father.makeMoney(10);
    }
}
