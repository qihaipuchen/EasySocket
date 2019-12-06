package com.easysocket;

import com.easysocket.entity.basemsg.BaseSingerSender;

/**
 * Author：Alex
 * Date：2019/6/11
 * Note：带有回调标识singer的发送消息
 */
public class SingerSender extends BaseSingerSender {

    private String msgId;
    private String from;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

}