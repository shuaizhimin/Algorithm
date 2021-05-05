package com.learn.build.factory.abstractf;

/**
 * create by shuaizhimin
 * create on 2021/4/25 23:14
 * 工厂方法模式_工厂接口
 */
public interface IMyMessageFactory {
    public IMyMessage createMessage(String messageType);
}
