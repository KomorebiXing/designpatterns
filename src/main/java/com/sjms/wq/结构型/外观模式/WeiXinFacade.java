package com.sjms.wq.结构型.外观模式;


/**
 * <p>
 * 门面
 * 测试 {@link com.sjms.wq.结构型.外观模式.Test#test()}
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 16:24
 */
public class WeiXinFacade {

    private Poliece poliece = new Poliece();
    private Social social = new Social();
    private Edu edu = new Edu();

    //外观模式 你已经抽出单一的方法 随意组合 ，组合的目的 如果这个操作很频繁
    // 那么直接调用这一个接口就可以了没有别要多次调用 而且方便维护
    public void handle(String name){
        System.out.println("开始办理");
        poliece.dealWith(name);
        social.dealWith(name);
        edu.dealWith(name);
    }

}
