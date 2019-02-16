package com.diaosichengxuyuan.java.design.mode.composite;

import org.junit.Test;

public class TestComposite {

    @Test
    public void test(){
        File file1 = new File("我是文件1");
        File file2 = new File("我是文件2");
        File file3 = new File("我是文件3");
        File file4 = new File("我是文件4");

        Folder folderA = new Folder("我是文件夹A");
        Folder folderB = new Folder("我是文件夹B");
        Folder folderRoot = new Folder("我是文件夹根");

        folderRoot.add(folderA);
        folderRoot.add(folderB);
        folderA.add(file1);
        folderA.add(file2);
        folderB.add(file3);
        folderB.add(file4);

        System.out.println(folderRoot);
    }

}
