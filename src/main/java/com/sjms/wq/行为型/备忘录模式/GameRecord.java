package com.sjms.wq.行为型.备忘录模式;

import java.util.StringJoiner;

/**
 * <p>
 * 游戏记录，需要保存的内部状态信息，也叫备忘录信息
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 13:51
 */
public  class GameRecord {

    /**
     * 代表记录的id
     */
    private Integer id;
    /**
     * 剩余金币
     */
    private Integer coin = 0;

    /**
     * 血量
     */
    private Integer hp = 0;

    /**
     * 蓝量
     */
    private Integer mp = 0;

    /**
     * 等级
     */
    private  Integer level = 0;

    public GameRecord() {
    }

    public GameRecord(Integer coin, Integer hp, Integer mp, Integer level) {
        this.coin = coin;
        this.hp = hp;
        this.mp = mp;
        this.level = level;
    }

    /**
     * 获取当前备忘录信息
     */
    public void getCurrent(){
        System.out.println("coin：" + coin + " hp："  + hp + " mp："  + mp +" level："   + level);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
