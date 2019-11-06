package com.diaosichengxuyuan.java.management.jmx;

/**
 * @author liuhaipeng
 * @date 2019/11/6
 */
public class Test implements TestMBean {

    private String name;

    private int age;

    @Override
    public String getName() {
        System.out.println("getName：" + name);
        return name;
    }

    @Override
    public void setName(String name) {
        System.out.println("setName：" + name);
        this.name = name;
    }

    @Override
    public int getAge() {
        System.out.println("getAge：" + age);
        return age;
    }

    @Override
    public void setAge(int age) {
        System.out.println("setAge：" + age);
        this.age = age;
    }

    @Override
    public void sayHello() {
        System.out.println("hello");
    }

}
