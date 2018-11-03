package com.diaosichengxuyuan.java.one.eight;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 测试1.8新特性
 * <p>
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
 * @date 2018/11/2
 */
public class TestNewFeature {

    /**
     * Print接口如果是泛型接口，lambda表达式支持 Print接口如果不是泛型接口，print方法是泛型方法，lambda表达式不支持
     * 参考：https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.27.3
     */
    @Test
    public void testLambda() {
        Print p = t -> System.out.println(t.toString());
        p.print("lhp");
    }

    /**
     * 详解：https://github.com/diaosichengxuyuan/java/issues/3
     */
    @Test
    public void testStreamFilterMapCollect() {
        List<String> ss = new ArrayList<>(10);
        ss.add("lhp1");
        ss.add("lhp2");
        ss.add("lhp3");
        ss.add("lhp4");

        List<String> ss1 = ss.stream().filter(s -> {
            if("lhp1".equals(s) || "lhp3".equals(s)) {
                return true;
            }
            return false;
        }).filter(s -> {
            if("lhp1".equals(s) || "lhp3".equals(s)) {
                return true;
            }
            return false;
        }).map(s -> {
            s = s;
            return s.toUpperCase();
        }).map(s -> {
            s = s;
            return s.toUpperCase();
        }).collect(Collectors.toList());
        System.out.println(ss1);
    }

    /**
     * 详解：https://github.com/diaosichengxuyuan/java/issues/4
     */
    @Test
    public void testStreamAllMatchAnyMatch() {
        List<String> ss = new ArrayList<>(10);
        ss.add("lhp1");
        ss.add("lhp2");
        ss.add("lhp3");
        ss.add("lhp4");

        boolean b = ss.stream().allMatch(s -> {
            s = s;
            return s.startsWith("lhp");
        });
        System.out.println(b);

        b = ss.stream().anyMatch(s -> {
            s = s;
            return s.equals("lhp3");
        });
        System.out.println(b);
    }

    /**
     * max/min采用选择排序中的一趟选择，就可以选择出最大或者最小的
     */
    @Test
    public void testStreamMaxMin() {
        List<String> ss = new ArrayList<>(10);
        ss.add("lhp3");
        ss.add("lhp1");
        ss.add("lhp4");
        ss.add("lhp2");

        String s = ss.stream().max((s1, s2) -> {
            s1 = s1;
            return s1.compareTo(s2);
        }).get();
        System.out.println(s);

       s = ss.stream().min((s1, s2) -> {
            s1 = s1;
            return s1.compareTo(s2);
        }).get();
        System.out.println(s);
    }

    /**
     * sort调用Arrays.sort，jdk1.8底层是二分插入排序，jdk1.6是归并排序
     */
    @Test
    public void testStreamSorted() {
        List<String> ss = new ArrayList<>(10);
        ss.add("lhp3");
        ss.add("lhp1");
        ss.add("lhp4");
        ss.add("lhp2");

        List<String> sss = ss.stream().sorted((s1, s2) -> {
            s1 = s1;
            return s1.compareTo(s2);
        }).collect(Collectors.toList());
        System.out.println(sss);
    }

    @Test
    public void testStreamFlatMap() {
        List<String> ss = new ArrayList<>(10);
        ss.add("lhp1");
        ss.add("lhp2");
        ss.add("lhp3");
        ss.add("lhp4");

        Set<String> sss = ss.stream().flatMap(s -> Stream.of(s.toUpperCase())).collect(Collectors.toSet());
        System.out.println(sss);
    }

    @Test
    public void testStreamReduce() {
        List<String> ss = new ArrayList<>(10);
        ss.add("lhp1");
        ss.add("lhp2");
        ss.add("lhp3");
        ss.add("lhp4");

        //将两个元素整合成一个
        String s = ss.stream().reduce((s1, s2) -> {
            s1 = s1;
            return s1 + s2;
        }).get();
        System.out.println(s);
    }
}
