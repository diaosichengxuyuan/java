package com.diaosichengxuyuan.java.design.mode.prototype;

public class Prototype implements Cloneable{

    @Override
    public Object clone(){
        try {
            return super.clone();
        } catch(CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
