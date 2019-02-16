package com.diaosichengxuyuan.java.design.mode.strategy;

import org.junit.Test;

public class TestStrategy {

    @Test
    public void test() {
        TrafficStrategySelector strategySelector = new TrafficStrategySelector();
        strategySelector.setTravel(new Car());
        strategySelector.printCost();
        strategySelector.setTravel(new HighSpeedRail());
        strategySelector.printCost();
        strategySelector.setTravel(new Plane());
        strategySelector.printCost();
    }

}
