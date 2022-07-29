package com.sjms.wq.行为型.责任链模式.ext;

/**
 * <p>
 * 回旋责任链
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 17:16
 */
public interface Filter {
    void doFilter(Request request,Response response,FilterChain chain);
}
