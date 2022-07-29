package com.sjms.wq.行为型.备忘录模式;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 游戏服务器 管理者
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 14:00
 */
public class GameServer {

    private Map<Integer, GameRecord> map = new HashMap<>();

    private Integer id = 0;

    public void add(GameRecord gameRecord) {
        gameRecord.setId(id++);
        map.put(id ++, gameRecord);
    }

    public ZhangYiXing get(Integer id) {
        final GameRecord gameRecord = map.get(id);
        gameRecord.getCurrent();
        return new ZhangYiXing(gameRecord.getCoin(),gameRecord.getHp(),gameRecord.getMp(),gameRecord.getLevel());
    }

}
