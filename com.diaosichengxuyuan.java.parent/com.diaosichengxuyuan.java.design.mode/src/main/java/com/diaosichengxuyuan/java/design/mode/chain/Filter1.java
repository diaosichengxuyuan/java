package com.diaosichengxuyuan.java.design.mode.chain;

public class Filter1 extends AbstractFilter{

    @Override
    protected void doInnerFilter() {
        System.out.println("过滤器1处理完成");
    }

}
