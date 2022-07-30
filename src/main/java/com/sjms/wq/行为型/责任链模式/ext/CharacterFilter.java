package com.sjms.wq.行为型.责任链模式.ext;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 17:25
 */
public class CharacterFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {

        request.msg += "===";
        System.out.println("CharacterFilter....doFilter之前");
        //往下放行
        chain.doFilter(request,response,chain);
        response.content += "===";
        System.out.println("CharacterFilter....doFilter之后");
    }
}
