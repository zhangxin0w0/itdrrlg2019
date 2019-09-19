package com.itdr.common;

/**
 * ClassName: Const
 * 日期: 2019/8/1 9:58
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Const {

    public static final String LOGINUSER = "login_user";
    public static final String TRADE_SUCCESS = "TRADE_SUCCESS";
    public static final String AUTOLOGINTOKEN = "autoLoginToken";
    public static final String JESSESSIONID_COOKIE = "JESSIONID_COOKIE";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";
    /**
     * 成功时通用状态码
     * */
    public static final  int SUCESS=200;

    /**
     * 失败时通用状态码
     * */
    public static  final int ERROR=100;

    public interface Cart{
        String LIMITQUANTITYSUCCESS="LIMIT_NUM_SUCCESS";
        String LIMITQUANTITYFAILED="LIMIT_NUM_FAILED";
        Integer CHECK=1;
        Integer UNCHECK=0;
    }

    public enum UsersEnum {
        NEED_LOGIN(2, "需要登录"),
        NO_LOGIN(101,"用户未登录");
        //状态信息


        private int code;
        private String desc;

        private UsersEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }





}
