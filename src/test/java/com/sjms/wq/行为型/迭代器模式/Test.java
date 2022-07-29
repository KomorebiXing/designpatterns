package com.sjms.wq.行为型.迭代器模式;

import com.sjms.wq.行为型.迭代器模式.BeautifulMan.Iterator;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 15:32
 */
public class Test {

    @org.junit.jupiter.api.Test
    void test(){
        final ZhangYiXin zhangYiXin = new ZhangYiXin();
        zhangYiXin.likeYou("刘亦菲");
        zhangYiXin.likeYou("杨幂");
        zhangYiXin.likeYou("刘诗诗");
        zhangYiXin.likeYou("迪丽热巴");

        final Iterator iterator = zhangYiXin.getIterator();
        System.out.println(iterator.current());
        System.out.println(iterator.firstLove());

        System.out.println("循环打印......");

        do {
            if (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }while (iterator.hasNext());




    }
}
