package com.utopia.common.vo;

import com.utopia.common.mymenu.ResultCode;
import lombok.Data;

@Data
public class R {
    private int code;
    private String msg;
    private Object data;
    public static R ok(String msg,Object data){
        R r = new R();
        r.setMsg(msg);
        r.setCode(ResultCode.SUCCESS.getCode());
        r.setData(data);
        return r;
    }
    public static R ok(Object data){
        return ok("ok",data);
    }
    public static R ok(){
        return ok(null);
    }
    public static R fail(String msg){
        R r = new R();
        r.setMsg(msg);
        r.setData(null);
        r.setCode(ResultCode.FAIL.getCode());
        return r;
    }
    public static R fail(){
        return fail("fail");
    }
}
