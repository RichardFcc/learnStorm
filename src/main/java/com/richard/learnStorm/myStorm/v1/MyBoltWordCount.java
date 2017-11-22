package com.richard.learnStorm.myStorm.v1;

/**
 * Describe:
 * Author:  richard
 * Domain:   www.richard.com
 * Data:     2016/1/6.
 */
public class MyBoltWordCount extends Thread {

    private MyStormProcessMain stormProcess;


    public void run() {
        while (true) {
            try {
                String word = (String) stormProcess.getWordQueue().take();
                stormProcess.wordcounter(word);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public MyBoltWordCount(MyStormProcessMain stormProcess) {
        this.stormProcess = stormProcess;
    }
}
