package com.yize.scalametadatamanagement.utils;


import java.io.Serializable;

/**
 * The return class of a http request
 */
public class ResultVO<T> implements Serializable {

    /** Error code*/
    private Integer code;

    /** Error msg*/
    private String msg;

    /** Contents*/
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
