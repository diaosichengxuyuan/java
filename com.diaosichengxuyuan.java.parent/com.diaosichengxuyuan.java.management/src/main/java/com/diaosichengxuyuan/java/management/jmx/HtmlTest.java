package com.diaosichengxuyuan.java.management.jmx;

import com.sun.jdmk.comm.HtmlAdaptorServer;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * 使用页面测试
 *
 * @author liuhaipeng
 * @date 2019/11/6
 */
public class HtmlTest {

    public static void main(String[] args) throws Exception {
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();

        ObjectName objectName = new ObjectName("mymbeantest:name=HtmlTest");
        server.registerMBean(new Test(), objectName);

        ObjectName adapterName = new ObjectName("mymbeantest:name=HtmlTestAdapter,port=8082");
        HtmlAdaptorServer adaptor = new HtmlAdaptorServer();
        server.registerMBean(adaptor, adapterName);

        adaptor.start();
    }

}
