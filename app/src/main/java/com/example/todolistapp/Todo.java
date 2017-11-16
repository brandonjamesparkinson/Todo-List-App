package com.example.todolistapp;

import java.util.Date;
import java.util.UUID;

/**
 * Created by brandonparkinson on 16/11/2017.
 */


public class Todo {
    private UUID mId;
    private String mTitle;
    private String mDetail;
    private Date mDate;
    private boolean mIsComplete;

    public UUID getId() {
        return mId;
    }

    public void setId(UUID mId) {
        this.mId = mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getDetail() {
        return mDetail;
    }

    public void setDetail(String mDetail) {
        this.mDetail = mDetail;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isIsComplete() {
        return mIsComplete;
    }

    public void setIsComplete(boolean mIsComplete) {
        this.mIsComplete = mIsComplete;
    }

    public void setComplete(boolean complete) {
        this.mIsComplete = complete;
    }

    public Todo() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }


}
