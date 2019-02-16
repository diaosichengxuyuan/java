package com.diaosichengxuyuan.java.design.mode.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    private String name;

    private final List<Folder> folderList = new ArrayList<Folder>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(Folder folder) {
        folderList.add(folder);
    }

    @Override
    public String toString() {
        return name + " " + (folderList.isEmpty() ? "" : folderList);
    }

}
