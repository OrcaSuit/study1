package com.example.study;

import java.util.UUID;

public class Study {

    private UUID mId;
    private String mTitle;

    public Study(){
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
