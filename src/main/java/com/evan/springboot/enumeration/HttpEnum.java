package com.evan.springboot.enumeration;

import sun.applet.Main;

public enum HttpEnum {
    HTTP_200(200,"success"),HTTP_500(500,"error");

    private Integer httpCode;
    private String httpMsg;

    public Integer getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    public String getHttpMsg() {
        return httpMsg;
    }

    public void setHttpMsg(String httpMsg) {
        this.httpMsg = httpMsg;
    }

    HttpEnum(Integer httpCode,String httpMsg) {
        System.out.println("init");
        this.httpCode=httpCode;
        this.httpMsg=httpMsg;
    }

    public static void main(String[] args) {
        System.out.println(HttpEnum.HTTP_200.getHttpCode());
        System.out.println(HttpEnum.HTTP_200.getHttpMsg());
    }
}
