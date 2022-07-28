package com.sjms.wq.结构型.适配器模式.demothrer.adapter;

import com.sjms.wq.结构型.适配器模式.demothrer.Player;
import com.sjms.wq.结构型.适配器模式.demothrer.Translator;
import java.util.Objects;

/**
 * <p>
 * 适配器
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 9:43
 */
public class JPMoviePlayerAdapter implements Player {

    //被适配的对象 可称为原接口
    private Player player;
    private Translator translator;
    public JPMoviePlayerAdapter(Player player) {
        this.player = player;
    }

    public void setTranslator(Translator translator) {
        this.translator = translator;
    }

    @Override
    public String play() {
        final String play = player.play();
        //如果无翻译器那么就是用原有逻辑
        if (Objects.isNull(translator)){
            return play;
        }
        return translator.translator(play);
    }
}
