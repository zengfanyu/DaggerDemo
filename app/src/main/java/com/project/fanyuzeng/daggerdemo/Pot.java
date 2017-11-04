package com.project.fanyuzeng.daggerdemo;

/**
 * @author:fanyuzeng
 * @date: 2017/11/3 15:32
 * @desc:
 */
public class Pot {
    private Flower mFlower;

    public Pot(Flower flower) {
        mFlower = flower;
    }


    public String show() {
        return mFlower.whisper();
    }
}
