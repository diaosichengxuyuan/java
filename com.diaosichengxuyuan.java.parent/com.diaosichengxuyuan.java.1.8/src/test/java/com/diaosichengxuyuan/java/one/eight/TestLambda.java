package com.diaosichengxuyuan.java.one.eight;

import org.junit.Test;

/**
 * lambda表达式，函数式编程
 *
 * 四大函数式接口如下：
 * Consumer<T> :消费型接口
 * void accept(T t);
 *
 * Supplier<T> :供给型接口
 * T get();
 *
 * Function<T,R> :函数型接口
 * R apply(T t);
 *
 * Predicate<T>:断言型接口
 * boolean test(T t);
 *
 * @author liuhaipeng
 * @date 2018/11/3
 */
public class TestLambda {

    /**
     * Print接口如果是泛型接口，lambda表达式支持 Print接口如果不是泛型接口，print方法是泛型方法，lambda表达式不支持
     * 参考：https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.27.3
     */
    @Test
    public void testLambda() {
        Print p = t -> System.out.println(t.toString());
        p.print("lhp");
    }
}
