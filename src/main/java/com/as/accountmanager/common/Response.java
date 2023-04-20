package com.as.accountmanager.common;

public class Response {
    public static final ResponseVO Ok(Object obj) {
        return new ResponseVO(MsgCode.Ok, "", obj.toString());
    }
    public static final ResponseVO Ok() {
        return new ResponseVO(MsgCode.Ok, "", null);
    }

    public static final ResponseVO Error() {
        return new ResponseVO(MsgCode.Error, "", null);
    }

    public static final ResponseVO Error(Object obj) {
        return new ResponseVO(MsgCode.Error, "", obj.toString());
    }

    public static final ResponseVO Fail(){
        return new ResponseVO(MsgCode.Fail, "", null);
    }
    public static final ResponseVO Fail(Object obj) {
        return new ResponseVO(MsgCode.Fail, "", obj.toString());
    }
}
