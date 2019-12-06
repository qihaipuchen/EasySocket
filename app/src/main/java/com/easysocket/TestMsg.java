package com.easysocket;

import com.easysocket.entity.basemsg.BaseSender;

/**
 * Author：Alex
 * Date：2019/12/6
 * Note：不带回调标识singer的消息
 */
public class TestMsg extends BaseSender {

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

    @Override
    public String toString() {
        return "TestMessage{" +
                "msgId='" + msgId + '\'' +
                ", from='" + from + '\'' +
                '}';
    }
}
