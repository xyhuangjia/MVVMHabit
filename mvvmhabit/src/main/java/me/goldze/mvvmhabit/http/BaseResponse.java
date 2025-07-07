package me.goldze.mvvmhabit.http;

import com.google.gson.annotations.SerializedName;

/**
 * Created by goldze on 2017/5/10.
 * 该类仅供参考，实际业务返回的固定字段, 根据需求来定义，
 */
public class BaseResponse<T> {
    @SerializedName(value = "code", alternate = {"status", "success", "errcode"})
    private int code;
    @SerializedName(value = "data", alternate = {"retData", "result"})
    private T data;
    @SerializedName(value = "message", alternate = {"msg", "retMsg", "errmsg"})
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getResult() {
        return data;
    }

    public void setResult(T result) {
        this.data = result;
    }

    public boolean isOk() {
        return code == 0;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}