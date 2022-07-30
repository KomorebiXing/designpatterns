package com.sjms.wq.行为型.责任链模式.ext;


import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 复杂的责任链模式  回调责任链
 * 1 -> 2 -> 3 -> 目标方法 -> 3 -> 2 -> 1
 *
 *  测试 {@link  com.sjms.wq.行为型.责任链模式.Test#ext_test()}
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 17:19
 */
public class FilterChain implements Filter {

    /**
     * 游标
     */
    int cursor = 0;

    /**
     * filter 的 链条
     */
    List<Filter> filterList = new ArrayList<>();

    /**
     * 最终要执行的方法
     */
    My target;

    public My getTarget() {
        return target;
    }

    public void setTarget(My target) {
        this.target = target;
    }

    public void addFilter(Filter filter){
        filterList.add(filter);
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if (cursor != filterList.size()){
            filterList.get(cursor++).doFilter(request,  response,  chain);
        }else {
            target.get();
        }

    }
}
