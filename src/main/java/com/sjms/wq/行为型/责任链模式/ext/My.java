package com.sjms.wq.行为型.责任链模式.ext;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * <p>
 *
 * </p>
 *
 * @author 世墨
 * @since 2022/7/29 17:29
 */
public class My {


    private Request request;

    private  Response response;

    public My(Request request, Response response) {
        this.request = request;
        this.response = response;
    }

    public void get(){
        System.out.println("request:"+ request.msg +"你好" +  "response:" + response.content);
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
