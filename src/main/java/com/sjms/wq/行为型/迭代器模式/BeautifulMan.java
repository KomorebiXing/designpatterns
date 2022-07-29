package com.sjms.wq.行为型.迭代器模式;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>
 * 抽象聚合类
 * 测试 {@link com.sjms.wq.行为型.迭代器模式.Test#test()}
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 15:29
 */
public abstract class BeautifulMan {


    private List<String> girlFriends = new ArrayList<>();

    public void likeYou(String name){
        girlFriends.add(name);
    }

    public void sayBye(String name){
        girlFriends.remove(name);
    }

    public Iterator getIterator(){
        return new Iterator();
    }

    class Iterator implements Itr{

        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return girlFriends.size() != cursor;
        }

        @Override
        public String next() {
            return girlFriends.get(cursor++);
        }

        @Override
        public String firstLove() {
            return girlFriends.get(0);
        }

        @Override
        public String current() {
            return girlFriends.get(girlFriends.size() - 1);
        }
    }

}
