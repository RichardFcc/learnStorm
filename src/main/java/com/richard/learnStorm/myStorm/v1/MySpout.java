package com.richard.learnStorm.myStorm.v1;

/**
 * Describe:
 * Author:  richard
 * Domain:   www.richard.com
 * Data:     2016/1/6.
 */
public class MySpout implements Runnable {

    private MyStormProcessMain stormProcess;

    public MySpout(MyStormProcessMain stormProcess) {
        this.stormProcess = stormProcess;
    }

    public void run() {
        //storm�����ѭ������spout��netxTuple����
        while (true) {
            stormProcess.nextTuple();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
        }
    }
}
