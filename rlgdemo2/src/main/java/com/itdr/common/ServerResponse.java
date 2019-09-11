package com.itdr.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * ClassName: ServerResponse
 * 日期: 2019/9/10 14:52
 *
 * @author Air张
 * @since JDK 1.8
 */

@Getter
@Setter
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ServerResponse<T> implements Serializable {
    private Integer status;
    private T data;
    private String msg;

    private ServerResponse(Integer status) {
        this.status = status;
    }

    private ServerResponse(Integer status, T data) {
        this.status = status;
        this.data = data;
    }

    private ServerResponse(Integer status, T data, String msg) {
        this.status = status;
        this.data = data;
        this.msg = msg;
    }

    private ServerResponse(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    private ServerResponse(String msg) {
        this.msg = msg;
    }


    public static <T> ServerResponse successRS() {
        return new ServerResponse(Const.SUCESS);
    }

    public static <T> ServerResponse successRS(String msg) {
        return new ServerResponse(Const.SUCESS,msg);
    }

    public static <T> ServerResponse successRS(T data) {
        return new ServerResponse(Const.SUCESS,data);
    }

    //    成功的时候传入状态码、数据、信息
    public static <T> ServerResponse successRS(T data, String msg) {
        return new ServerResponse(Const.SUCESS,data, msg);
    }

    public static <T> ServerResponse defeatedRS(Integer errorCode, String errorMessage) {
        return new ServerResponse(errorCode, errorMessage);
    }

    public static <T> ServerResponse defeatedRS(String errorMessage) {
        return new ServerResponse(Const.ERROR,errorMessage);
    }

    @JsonIgnore
    public boolean isSuccess() {
        return this.status == Const.SUCESS;
    }

}
