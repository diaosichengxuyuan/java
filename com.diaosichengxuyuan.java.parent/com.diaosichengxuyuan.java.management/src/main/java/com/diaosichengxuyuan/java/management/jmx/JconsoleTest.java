package com.diaosichengxuyuan.java.management.jmx;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.util.concurrent.locks.LockSupport;

/**
 * 使用jconsole测试
 *
 * @author liuhaipeng
 * @date 2019/11/6
 */
public class JconsoleTest {

    public static void main(String[] args) throws Exception {
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName = new ObjectName("mymbeantest:name=JconsoleTest");
        server.registerMBean(new Test(), objectName);
        LockSupport.park();
    }

}
