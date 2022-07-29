package com.sjms.wq.行为型.命令模式.demotwo;



/**
 * <p>
 * 测试 {@link com.sjms.wq.行为型.命令模式.domotwo.Test#test()}
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 15:05
 */
public class TeacherTongInvoker {
    Command command;

    public void call(){
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
