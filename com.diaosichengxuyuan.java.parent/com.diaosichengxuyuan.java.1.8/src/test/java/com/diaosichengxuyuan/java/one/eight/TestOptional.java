package com.diaosichengxuyuan.java.one.eight;

import org.junit.Test;

import java.util.Optional;

/**
 * optional常用接口
 *
 * @author liuhaipeng
 * @date 2018/11/3
 */
public class TestOptional {

    @Test
    public void testOrElse() {
        Optional<Object> op = Optional.ofNullable(null);
        try {
            op.get();
        } catch(Exception e) {
            e.printStackTrace();
        }
        Object o = op.orElse("lhp");
        System.out.println(o);
        o = op.orElseGet(() -> "lhp");
        System.out.println(o);
        try {
            op.orElseThrow(NullPointerException::new);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMapFilter() {
        Optional<String> o = Optional.of("123");
        String s = o.get();
        System.out.println(s);

        boolean b = o.map(Integer::new).isPresent();
        System.out.println(b);

        s = o.get();
        System.out.println(s);

        s = o.filter(ss -> ss.startsWith("1")).get();
        System.out.println(s);
    }
}
