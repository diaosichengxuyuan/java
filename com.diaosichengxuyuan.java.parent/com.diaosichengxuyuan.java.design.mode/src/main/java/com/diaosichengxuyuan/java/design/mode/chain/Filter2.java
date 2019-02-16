package com.diaosichengxuyuan.java.design.mode.chain;

public class Filter2 extends AbstractFilter{

    @Override
    protected void doInnerFilter() {
        System.out.println("过滤器2处理完成");
    }

}
