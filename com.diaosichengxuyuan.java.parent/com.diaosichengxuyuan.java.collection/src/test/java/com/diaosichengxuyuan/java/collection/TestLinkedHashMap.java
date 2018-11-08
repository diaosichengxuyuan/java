package com.diaosichengxuyuan.java.collection;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * LinkedHashMap，详解：https://github.com/diaosichengxuyuan/java/issues/16
 *
 * @author liuhaipeng
 * @date 2018/11/6
 */
public class TestLinkedHashMap {

    @Test
    public void test() {
        Map<String, Integer> map = new LinkedHashMap<>(16, 0.75F, true);
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
        i = map.get("4");
        System.out.println(i);
        i = map.get("5");
        System.out.println(i);
        System.out.println(map);

        i = map.remove("2");
        System.out.println(map);

        boolean b = map.remove("3", Integer.valueOf(44));
        System.out.println(map);

        int size = map.size();
        System.out.println(size);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry entry : entries) {
            System.out.println(entry);
        }
    }
}
