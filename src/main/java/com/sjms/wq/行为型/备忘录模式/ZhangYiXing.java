package com.sjms.wq.行为型.备忘录模式;

import java.util.Random;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 13:41
 */
public class ZhangYiXing {

    /**
     * 剩余金币
     */
    private Integer coin;

    /**
     * 血量
     */
    private Integer hp;

    /**
     * 蓝量
     */
    private Integer mp;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 此处可以灵活使用 多样化
     */
    private GameServer gameServer = new GameServer();

    public ZhangYiXing() {
    }

    public ZhangYiXing(Integer coin, Integer hp, Integer mp, Integer level) {
        this.coin = coin;
        this.hp = hp;
        this.mp = mp;
        this.level = level;
    }

    /**
     * 以上是内部状态，是需要记录的
     */

    public void saveGameRecord() {
        System.out.println("正在保存当前记录,信息为" + "coin：" + coin + " hp：" + hp + " mp：" + mp + " level：" + level);
        gameServer.add(new GameRecord(coin, hp, mp, level));
    }

    public void getFromMemento(Integer id) {
        System.out.println("获取历史存档信息");
        final ZhangYiXing zhangYiXing = getGameServer().get(id);
        this.coin = zhangYiXing.getCoin();
        this.hp = zhangYiXing.getHp();
        this.mp = zhangYiXing.getMp();
        this.level = zhangYiXing.getLevel();
    }

    public void playGame() {
        System.out.println("玩游戏");
        coin = new Random().nextInt();
        hp = new Random().nextInt();
        mp = new Random().nextInt();
        level = new Random().nextInt();
        System.out.println("当前值为：" + "coin：" + coin + " hp：" + hp + " mp：" + mp + " level：" + level);
    }

    public void exitGame() {
        System.out.println("退出游戏");
        //存档
        saveGameRecord();
    }

    public GameServer getGameServer() {
        return gameServer;
    }

    public void setGameServer(GameServer gameServer) {
        this.gameServer = gameServer;
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
