package com.sjms.wq.结构型.组合模式;


import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 测试 {@link com.sjms.wq.结构型.组合模式.Test#test()}
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 16:53
 */
public class Menu {

    private  Integer id;

    private String name;

    private StringBuilder chr = new StringBuilder("-");

    private List<Menu> childs = new ArrayList<>();

    public Menu(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setChr(StringBuilder chr) {
        this.chr = chr;
    }

    //提供添加层级的方法
    void addChildMenu(Menu menu){
        childs.add(menu);
    }

    //层级遍历
    void printMenu(){
        System.out.println(this.chr +name);
        for (Menu child : childs) {
            child.setChr(this.chr.append("-"));
            child.printMenu();
        }
    }
}
