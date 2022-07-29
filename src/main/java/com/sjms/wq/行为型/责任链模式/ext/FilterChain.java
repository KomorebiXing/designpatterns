package com.sjms.wq.行为型.责任链模式.ext;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 靠他维护链条
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
        }

    }
}
