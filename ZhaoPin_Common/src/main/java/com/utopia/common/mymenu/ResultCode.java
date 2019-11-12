package com.utopia.common.mymenu;

/**
 * 枚举 定义统一返回码
 * 200 成功
 * 4000 失败
 * @author Administrator*/
public enum ResultCode {
    SUCCESS(200),
    FAIL(400);
    private int code;
    ResultCode(int v){
        code=v;
    }
    public int getCode(){
        return code;
    }
}
