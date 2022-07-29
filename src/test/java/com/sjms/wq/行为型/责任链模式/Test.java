package com.sjms.wq.行为型.责任链模式;

import com.sjms.wq.行为型.责任链模式.ext.CharacterFilter;
import com.sjms.wq.行为型.责任链模式.ext.EncodingFilter;
import com.sjms.wq.行为型.责任链模式.ext.FilterChain;
import com.sjms.wq.行为型.责任链模式.ext.HttpFilter;
import com.sjms.wq.行为型.责任链模式.ext.Request;
import com.sjms.wq.行为型.责任链模式.ext.Response;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 17:02
 */
public class Test {

    @org.junit.jupiter.api.Test
    void simple_test(){
        final Teacher teacher1 = new Teacher("胡歌老师");
        final Teacher teacher2 = new Teacher("刘亦菲老师");
        final Teacher teacher3 = new Teacher("杨幂老师");

        //构造链条
        teacher1.setNext(teacher2);
        teacher2.setNext(teacher3);

        teacher1.handleRequset();

    }

    /**
     * 1 -- 2 --3 -- my -- 3-- 2--1
     */
    @org.junit.jupiter.api.Test
    void ext_test(){
        FilterChain filterChain = new FilterChain();

        final HttpFilter httpFilter = new HttpFilter();
        final EncodingFilter encodingFilter = new EncodingFilter();
        final CharacterFilter characterFilter = new CharacterFilter();

        filterChain.addFilter(httpFilter);
        filterChain.addFilter(encodingFilter);
        filterChain.addFilter(characterFilter);


        filterChain.doFilter(new Request("123"),new Response("嘿嘿"),filterChain);

    }

}
