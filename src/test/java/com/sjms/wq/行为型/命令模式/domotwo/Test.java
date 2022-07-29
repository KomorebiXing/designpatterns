package com.sjms.wq.行为型.命令模式.domotwo;

import com.sjms.wq.行为型.命令模式.demotwo.TeacherTongInvoker;
import com.sjms.wq.行为型.命令模式.demotwo.WuWanTravelCommand;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 15:11
 */
public class Test {

    @org.junit.jupiter.api.Test
    void test(){
        final TeacherTongInvoker teacherTongInvoker = new TeacherTongInvoker();
        teacherTongInvoker.setCommand(new WuWanTravelCommand());
        teacherTongInvoker.call();
    }
}
