package com.diaosichengxuyuan.java.design.mode.wrapper;

/**
 * 美食家
 *
 * @author liuhaipeng
 * @date 2019/2/14
 */
public class GastronomeWrapper implements Eater {

    private Eater eater;

    public GastronomeWrapper(Eater eater) {
        this.eater = eater;
    }

    @Override
    public void eatApple() {
        System.out.println("先削皮");
        System.out.println("再切块");
        System.out.println("再配点牛奶");
        eater.eatApple();
    }

}
