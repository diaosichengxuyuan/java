package com.diaosichengxuyuan.java.design.mode.strategy;

public class TrafficStrategySelector {

    private Travel travel;

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public void printCost() {
        System.out.println(travel.getName() + "耗时" + travel.cost());
    }

}
