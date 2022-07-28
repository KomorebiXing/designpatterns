package com.sjms.wq.结构型.适配器模式.demothrer.adapter;

import com.sjms.wq.结构型.适配器模式.demothrer.Translator;

/**
 * <p>
 * 日文翻译器
 * </p>
 *
 * @author 世墨
 * @since 2022/7/28 9:47
 */
public class Zh_JPTranslator implements Translator {

    @Override
    public String translator(String content) {
        if ("从前。。。".equals(content)){
            return "日语打印：从前...";
        }
        return "null";
    }
}
