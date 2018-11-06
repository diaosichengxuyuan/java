package com.diaosichengxuyuan.java.collection;

import org.junit.Test;

import java.util.Stack;

/**
 * stack 可以用ArrayList或者LinkedList模拟栈，一般不用java.util.Stack，因为它每一步都有获取锁和释放锁的开销
 *
 * @author liuhaipeng
 * @date 2018/11/6
 */
public class TestStack {

    @Test
    public void test() {
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        String s = stack.peek();
        System.out.println(s);
        s = stack.peek();
        System.out.println(s);

        s = stack.pop();
        System.out.println(s);
        s = stack.peek();
        System.out.println(s);
    }
}
