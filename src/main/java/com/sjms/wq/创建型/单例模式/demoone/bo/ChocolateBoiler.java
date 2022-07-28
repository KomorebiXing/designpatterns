package com.sjms.wq.创建型.单例模式.demoone.bo;

/**
 * @Author: 世墨
 * @Date: 2022/3/24 13:43
 * @DESCRIPTION 巧克力工厂  通过静态方法
 */
public class ChocolateBoiler{

    /**
     * 锅是否为空
     */
    private boolean empty;
    /**
     * 是否煮沸
     */
    private boolean boiled;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }


    public static ChocolateBoiler getInstance(){
        return new ChocolateBoiler();
    }

    /**
     * 在锅炉内填入原料时，锅炉必须是空的，一旦填入原料，愧疚把 empty 和 bolied 标识设置好
     */
    public void fill() {
        if (isEmpty()){
            empty = false;
            boiled = false;
            //在锅炉内填满巧克力和牛奶的混合物
            System.out.println("在锅炉内填满巧克力和牛奶的混合物");
        }
    }

    /**
     * 锅炉排出时，必须是满的(不可以是空的)而且是煮过的，派出完毕后，把empty标志设会true
     */
    public void drain(){
        if(!isEmpty() && isBoiled()){
            //排出煮沸的巧克力和牛奶
            System.out.println("排出煮沸的巧克力和牛奶");
            empty = true;
        }
    }

    /**
     * 煮混合物时,锅炉必须是满的，并且是没有煮过的，一旦煮沸后，就把boiled标志设为true
     */
    public void boil(){
        if (!isEmpty() && !isBoiled()){
            //将锅炉物煮沸
            System.out.println("将锅炉物煮沸");
            boiled = true;
        }
    }


    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
