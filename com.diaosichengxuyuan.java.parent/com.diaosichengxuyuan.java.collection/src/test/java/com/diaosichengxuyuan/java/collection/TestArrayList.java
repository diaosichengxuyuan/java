package com.diaosichengxuyuan.java.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayList，详解：https://github.com/diaosichengxuyuan/java/issues/9
 *
 * @author liuhaipeng
 * @date 2018/11/6
 */
public class TestArrayList {

    /**
     * 不能超过Integer.MAX_VLAUE 为了防止经常扩容，最好初始化数组的大小
     */
    @Test
    public void test() {
        //默认大小10
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        //扩容10+10>>2=15，数组copy
        list.add("11");
        System.out.println(list);

        //数组中间插入，需要数组copy，尽量避免此种操作
        list.add(5, "55");
        System.out.println(list);

        //数组中间删除，需要数组copy，尽量避免此种操作
        String s = list.remove(5);
        System.out.println(list);

        //遍历数组查找，查找性能o(n)，然后删除需要数组copy，尽量避免此种操作
        boolean b = list.remove("5");
        System.out.println(list);

        //数组下标2-5，不包括下标5，实现是：ArrayList的子类(组合模式)
        List<String> ss = list.subList(2, 5);
        System.out.println(ss);
        ss.add("77");
        System.out.println(ss);
        //父集合也增加了77
        System.out.println(list);

        //重新浅copy了一个数组，这样在数组中增删对象不会影响到原始的List
        Object[] o = list.toArray();
        System.out.println(Arrays.toString(o));

        try {
            //不支持修改，for循环的实现也是迭代器
            for(String sss : list) {
                list.remove(sss);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            //可以迭代中删除，但是不能并发
            iterator.remove();
        }

    }
}
