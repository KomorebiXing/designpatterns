package com.sjms.wq.迭代器与组合模式.demoone.vo;

import java.util.StringJoiner;

/**
 * @Author: 世墨
 * @Date: 2022/4/28 19:52
 * @DESCRIPTION 菜单项
 */
public class MenuItem {

    String name;

    String description;

    String vegetarian;

    double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(String vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MenuItem.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("description='" + description + "'")
                .add("vegetarian='" + vegetarian + "'")
                .add("price=" + price)
                .toString();
    }
}
