package com.example.myapplication.Entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Top250V<A> {

    private int count;
    private int start;
    private int total;
    private String title;
    private A subjects;


    public A getSubjects() {
        return subjects;
    }
    public void setSubjects(A subjects) {
        this.subjects = subjects;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

