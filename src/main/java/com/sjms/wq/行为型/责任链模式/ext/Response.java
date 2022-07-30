package com.sjms.wq.行为型.责任链模式.ext;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 17:19
 */
public class Response {
    String content;

    public Response(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
