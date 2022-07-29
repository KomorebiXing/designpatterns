package com.sjms.wq.行为型.责任链模式;

import java.util.Optional;
import java.util.StringJoiner;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 16:59
 */
public  class Teacher {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    /**
     * 下一个处理的老师
     */
    private Teacher next;

    public Teacher getNext() {
        return next;
    }

    public void setNext(Teacher next) {
        this.next = next;
    }

    public void handleRequset(){
        System.out.println(this + "正在处理");
        Optional.ofNullable(next).ifPresent(e ->{
            next.handleRequset();
        });

    };

    @Override
    public String toString() {
        return new StringJoiner(", ", Teacher.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
