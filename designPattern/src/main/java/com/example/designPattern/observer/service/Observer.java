package com.example.designPattern.observer.service;

public interface Observer {
    void update(String commentary);

    void subscribe();

    void unSubscribe();
}
