package com.diaosichengxuyuan.java.proxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * cglib proxy 参考：https://github.com/diaosichengxuyuan/java/issues/8
 *
 * @author liuhaipeng
 * @date 2018/11/5
 */
public class TestCglibProxy {

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
            "/Users/liuhaipeng/Documents/code/IdeaProject/java/com.diaosichengxuyuan.java.parent/com"
                + ".diaosichengxuyuan.java.proxy/target/classes/com/diaosichengxuyuan/java/proxy");
        new TestCglibProxy().test();
    }

    public void test() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MyComputerImpl.class);
        enhancer.setCallback((MethodInterceptor)(o, method, objects, methodProxy) -> {
            System.out.println("前置切面");
            Object object = methodProxy.invokeSuper(o, objects);
            System.out.println(object);
            System.out.println("后置切面");
            return object;
        });
        MyComputerImpl computer = (MyComputerImpl)enhancer.create();
        computer.add(Integer.valueOf(5), Integer.valueOf(6));
    }
}
