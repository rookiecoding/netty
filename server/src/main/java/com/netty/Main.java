package com.netty;

import com.netty.server.FileUploadServer;
import com.netty.server.NettyServer;
/*
 * @author mal
 * @date 2019/12/10 26:56
 * nettyServer
 */
public class Main {

    public static void main(String[] args) throws Exception {
        //启动server服务
//        new NettyServer().bind(8081);

        try {
            new FileUploadServer().bind(9991);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
