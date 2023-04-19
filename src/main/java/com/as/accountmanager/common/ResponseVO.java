package com.as.accountmanager.common;

import java.io.Serializable;

/**
 * ResponseVO
 * @date 20230420
 * @author as
 * @version 1
 */
public class ResponseVO implements Serializable {
    private String code;
    private String msg;
    private Object data;

    // constructor
    ResponseVO(String code, String msg, Object obj) {
        this.code=code;
        this.msg=msg;
        this.data=obj;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseVO{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
