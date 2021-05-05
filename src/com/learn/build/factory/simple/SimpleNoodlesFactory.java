package com.learn.build.factory.simple;

/**
 * create by shuaizhimin
 * create on 2021/4/25 22:38
 */
public class SimpleNoodlesFactory {
    public static final int TYPE_LZ = 1;//兰州拉面
    public static final int TYPE_PM = 2;//泡面
    public static final int TYPE_GC = 3;//干脆面

    public static void main(String args[]){
        INoodles noodles = SimpleNoodlesFactory.createNoodles(SimpleNoodlesFactory.TYPE_LZ);
        noodles.desc();
        INoodles noodles1 = SimpleNoodlesFactory.createNoodles(SimpleNoodlesFactory.TYPE_PM);
        noodles1.desc();
        INoodles noodles2 = SimpleNoodlesFactory.createNoodles(SimpleNoodlesFactory.TYPE_GC);
        noodles2.desc();
    }

    public static INoodles createNoodles(int type) {
        switch (type) {
            case TYPE_LZ:
                return new LzNoodles();
            case TYPE_PM:
                return new PaoNoodles();
            case TYPE_GC:
            default:
                return new GancuiNoodles();
        }
    }
}
