package com.diaosichengxuyuan.java.management.jmx;

/**
 * 测试
 *
 * @author liuhaipeng
 * @date 2019/11/6
 */
public interface TestMBean {

    String getName();

    void setName(String name);

    int getAge();

    void setAge(int age);

    void sayHello();
}
