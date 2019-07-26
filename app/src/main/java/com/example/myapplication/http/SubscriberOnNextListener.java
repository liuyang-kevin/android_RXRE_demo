package com.example.myapplication.http;

public interface SubscriberOnNextListener<T> {
    void onNext(T t);
}