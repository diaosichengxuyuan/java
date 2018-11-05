package com.diaosichengxuyuan.java.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * jdk proxy 参考：https://github.com/diaosichengxuyuan/java/issues/7
 *
 * @author liuhaipeng
 * @date 2018/11/5
 */
public class TestJdkProxy {

    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        new TestJdkProxy().test();
    }

    public void test() {
        MyComputer impl = new MyComputerImpl();
        MyComputer<Integer> computer = (MyComputer)Proxy.newProxyInstance(
            Thread.currentThread().getContextClassLoader(), new Class[] {MyComputer.class}, (proxy, method, args) -> {
                System.out.println("前置切面");
                Object o = method.invoke(impl, args);
                System.out.println(o);
                System.out.println("后置切面");
                return o;
            });

        computer.add(Integer.valueOf(5), Integer.valueOf(6));
    }
}
