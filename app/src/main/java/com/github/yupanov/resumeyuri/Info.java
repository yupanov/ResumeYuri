package com.github.yupanov.resumeyuri;

public class Info {
    private int mId;
    private String mTitle;
    private String mDescription;

    public Info(int id, String title, String description) {
        mId = id;
        mTitle = title;
        mDescription = description;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
