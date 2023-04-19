package com.as.accountmanager.common;

public class Response {
    public static final ResponseVO Ok(Object obj) {
        return new ResponseVO(MsgCode.Ok, "", null);
    }
    public static final ResponseVO Ok() {
        return new ResponseVO(MsgCode.Ok, "", null);
    }

    public static final ResponseVO Error() {
        return new ResponseVO(MsgCode.Error, "", null);
    }

    public static final ResponseVO Error(Object obj) {
        return new ResponseVO(MsgCode.Error, "", null);
    }
}
