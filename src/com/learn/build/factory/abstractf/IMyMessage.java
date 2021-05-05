package com.learn.build.factory.abstractf;

import java.util.Map;

/**
 * create by shuaizhimin
 * create on 2021/4/25 23:17
 */
public interface IMyMessage {
    public Map<String, Object> getMessageParam();

    public void setMessageParam(Map<String, Object> messageParam);

    public void sendMesage() throws Exception;// 发送通知/消息
}
