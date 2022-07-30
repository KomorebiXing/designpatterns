package com.sjms.wq.行为型.责任链模式.ext;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 17:24
 */
public class HttpFilter implements Filter{

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {

        request.msg += ">>>";

        System.out.println("HttpFilter....doFilter之前");
        //往下放行
        chain.doFilter(request,response,chain);
        response.content += "<<<";
        System.out.println("HttpFilter....doFilter之后");
    }
}
