package com.sjms.wq.行为型.迭代器模式;

/**
 * <p>
 * 迭代器接口
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 15:35
 */
public interface Itr {

    /**
     * 有没有下一个
     * @return
     */
    boolean hasNext();

    /**
     * 返回下一个
     * @return
     */
    String next();

    /**
     * 返回第一个
     * @return
     */
    String firstLove();

    /**
     *  返回最后一个
     * @return
     */
    String current();
}
