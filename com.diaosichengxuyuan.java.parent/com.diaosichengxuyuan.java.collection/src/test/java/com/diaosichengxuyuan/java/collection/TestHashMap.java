package com.diaosichengxuyuan.java.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap，详解：https://github.com/diaosichengxuyuan/java/issues/11
 *
 * @author liuhaipeng
 * @date 2018/11/6
 */
public class TestHashMap {

    @Test
    public void test() {
        Map<String, Integer> map = new HashMap<>();
        map.put("1",Integer.valueOf(1));
        map.put("2",Integer.valueOf(2));
        map.put("3",Integer.valueOf(3));
        System.out.println(map);
        map.put("3",Integer.valueOf(33));
        System.out.println(map);

        Integer i = map.remove("2");
        System.out.println(map);

        boolean b = map.remove("3", Integer.valueOf(44));
        System.out.println(map);
    }
}
