package com.sjms.wq.结构型.享元模式;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 17:23
 */
public class Test {

    /**
     * 和线程池的感觉很像
     * 工号: 88794c9b-050f-4805-8562-b77aaf8f2fb2 姓名: 王钰 正在为你服务.....
     * 工号: 6d06f68d-839a-4c23-8831-f8ae97b561b0 姓名: 王鑫 正在为你服务.....
     * 工号: 8e9db5c1-6944-4fa7-aa3e-487be6bdd9d4 姓名: 小家伙 正在为你服务.....
     * 工号: c27a0f08-964a-4731-86d3-6e94bd6526bb 姓名: 王波 正在为你服务.....
     */
    @org.junit.jupiter.api.Test
    void test(){
        AbstractWaitressFlyweight waitress = ZuDao.getWaitress("88794c9b-050f-4805-8562-b77aaf8f2fb2");
        waitress.service();
        waitress.end();
    }

}
