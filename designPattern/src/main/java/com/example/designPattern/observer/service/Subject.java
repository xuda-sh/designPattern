package com.example.designPattern.observer.service;

public interface Subject {
    public void subscribeObserver(Observer observer);

    public void unSubscribeObserver(Observer observer);

    public void notifyObservers();

    String subjectDetails();

}
