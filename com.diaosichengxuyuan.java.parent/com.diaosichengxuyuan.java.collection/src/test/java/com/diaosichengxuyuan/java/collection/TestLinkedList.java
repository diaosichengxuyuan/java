package com.diaosichengxuyuan.java.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList，详解：https://github.com/diaosichengxuyuan/java/issues/10
 *
 * @author liuhaipeng
 * @date 2018/11/6
 */
public class TestLinkedList {

    @Test
    public void test() {
        List<String> list = new LinkedList<>();

        //形成一个带头尾节点的双向链表
        list.add("1");
        list.add("2");
        list.add("4");
        list.add("5");
        System.out.println(list);

        list.add(2,"3");
        System.out.println(list);

        boolean b = list.remove("2");
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            //可以迭代中删除，但是不能并发
            iterator.remove();
        }
    }
}
