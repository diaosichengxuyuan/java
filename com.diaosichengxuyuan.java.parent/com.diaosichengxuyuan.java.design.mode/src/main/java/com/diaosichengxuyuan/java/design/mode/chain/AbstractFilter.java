package com.diaosichengxuyuan.java.design.mode.chain;

public abstract class AbstractFilter implements Filter {

    private Filter nextFilter;

    public void setNextFilter(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }

    @Override
    public void doFilter() {
       doInnerFilter();
       if(nextFilter != null){
           nextFilter.doFilter();
       }
    }

    protected abstract void doInnerFilter();
}
