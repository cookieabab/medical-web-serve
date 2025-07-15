package com.qst.medical.util;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
public class Msg {

    @Override
    public String toString() {
        return "Msg{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", success=" + success +
                ", data=" + data +
                '}';
    }

    /*状态码*/
    private Integer code;
    /*响应消息*/
    private String message;
    /*响应是否成功标志*/
    private boolean success;
    /*响应的数据*/
    private Map<String,Object> data = new HashMap<>();
    //get/set方法以及其他方法略

    public static Msg success() {
        Msg msg = new Msg();
        msg.setCode(20000);
        msg.setMessage("响应成功");
        msg.setSuccess(true);
        return msg;
    }
    public static Msg fail() {
        Msg msg = new Msg();
        msg.setCode(10000);
        msg.setMessage("响应失败");
        msg.setSuccess(false);
        return msg;
    }

    public Msg data(String key, Object value) {
        this.data.put(key,value);
        return this;
    }
    public Msg code(Integer code) {
        this.setCode(code);
        return this;
    }
    public Msg mess(String str) {
        this.setMessage(str);
        return this;
    }

}
