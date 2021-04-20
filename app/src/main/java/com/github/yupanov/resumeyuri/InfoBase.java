package com.github.yupanov.resumeyuri;

import java.util.ArrayList;
import java.util.List;

public class InfoBase {
    private static InfoBase sInfoBase;

    public static InfoBase get() {
        if (sInfoBase == null) {
            sInfoBase = new InfoBase();
        }
        return sInfoBase;
    }

    public List<Info> getInfoBase() {
        List<Info> infoList = new ArrayList<>();
        infoList.add(0, new Info(0, "Contacts", "11-3214-7310"));
        infoList.add(1, new Info(1, "Skills", "Python, JavaScript, C++ (Arduino), MySQL, HTML, CSS, React, NodeJS, Bootstrap, Git"));
        return infoList;
    }

    public Info getInfoItem(int id) {
        return getInfoBase().get(id);
    }

}
