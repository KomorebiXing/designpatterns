package com.sjms.wq.行为型.模板方法模式.demotwo;


/**
 * <p>
 * 1.定义模板
 * </p>
 *
 * 测试 {@link com.sjms.wq.行为型.模板方法模式.demotwo.Test#test()}
 * @author 世墨
 * @since 2022/7/29 8:51
 */
public abstract class CookTemplate {

    /**
     * 定义算法
     */
    public void cook(){
        //定义算法步骤
        heating();
        addFood();
        addSalt();
        end();
    }

    private void heating(){
        System.out.println("开火...");
    }

    /**
     * 添加食物
     */
    public abstract void addFood();


    /**
     * 加盐
     */
    public abstract void addSalt();

    /**
     * 出锅
     */
    private void end(){
        System.out.println("出锅....");
    }

}
