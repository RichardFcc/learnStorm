package com.richard.learnStorm.myStorm.v2.impl;

/**
 * Describe:
 * Author:  richard
 * Domain:   www.richard.com
 * Data:     2016/1/6.
 */
public class MyTopologyMain {

    public static void main(String[] args) {
        TopoBuilder topoBuilder = new TopoBuilder();
        topoBuilder.setSpout(new MySentenceSpout());
        topoBuilder.setBolt(new MySplitBolt());
        topoBuilder.setBolt(new MyWordCounterBolt());
        topoBuilder.submitTopology();
    }

}
