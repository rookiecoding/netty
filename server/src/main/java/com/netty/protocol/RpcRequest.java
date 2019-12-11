package com.netty.protocol;
/*
 * @author mal
 * @date 2019/12/10 26:56
 * 传输请求对象
 */

import java.io.Serializable;

public class RpcRequest implements Serializable{

    private static final long serialVersionUID = -2577707401136472809L;

    private String id;
    private Object data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RpcRequest{" + "id='" + id + '\'' + ", data=" + data + '}';
    }
}
