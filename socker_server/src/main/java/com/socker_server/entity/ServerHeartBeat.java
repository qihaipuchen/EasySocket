package com.socker_server.entity;

import com.socker_server.entity.message.SingerServerMsg;

/**
 * Author：Alex
 * Date：2019/6/6
 * Note：
 */
public class ServerHeartBeat extends SingerServerMsg {

    private String from;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
