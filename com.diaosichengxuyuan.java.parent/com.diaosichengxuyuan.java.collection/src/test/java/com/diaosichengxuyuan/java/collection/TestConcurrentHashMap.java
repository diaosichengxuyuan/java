package com.diaosichengxuyuan.java.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap，详解：https://github.com/diaosichengxuyuan/java/issues/13 https://github.com/diaosichengxuyuan/java/issues/14
 *
 * @author liuhaipeng
 * @date 2018/11/6
 */
public class TestConcurrentHashMap {

    @Test
    public void test() {
        Map<String, Integer> map = new ConcurrentHashMap<>(4);
        map.put("1", Integer.valueOf(1));
        map.put("2", Integer.valueOf(2));
        map.put("3", Integer.valueOf(3));
        map.put("4", Integer.valueOf(4));
        map.put("5", Integer.valueOf(5));
        map.put("6", Integer.valueOf(6));
        map.put("7", Integer.valueOf(7));
        map.put("8", Integer.valueOf(8));
        map.put("9", Integer.valueOf(9));
        System.out.println(map);
        map.put("3", Integer.valueOf(33));
        System.out.println(map);

        Integer i = map.get("3");
        System.out.println(i);

        i = map.remove("2");
        System.out.println(map);

        boolean b = map.remove("3", Integer.valueOf(44));
        System.out.println(map);

        int size = map.size();
        System.out.println(size);
    }
}
