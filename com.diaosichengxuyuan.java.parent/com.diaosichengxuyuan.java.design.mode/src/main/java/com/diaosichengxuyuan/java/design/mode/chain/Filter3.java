package com.diaosichengxuyuan.java.design.mode.chain;

public class Filter3 extends AbstractFilter{

    @Override
    protected void doInnerFilter() {
        System.out.println("过滤器3处理完成");
    }

}
