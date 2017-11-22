package com.richard.learnStorm.myStorm.v2;

import java.util.concurrent.BlockingQueue;

/**
 * Describe:
 * Author:  richard
 * Domain:   www.richard.com
 * Data:     2016/1/6.
 */
public interface MySpout extends Runnable {

    public void open(BlockingQueue collector);
    public void nextTuple();
}
