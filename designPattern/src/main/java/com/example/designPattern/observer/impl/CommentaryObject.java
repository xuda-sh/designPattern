package com.example.designPattern.observer.impl;

import com.example.designPattern.observer.service.Commentary;
import com.example.designPattern.observer.service.Observer;
import com.example.designPattern.observer.service.Subject;

import java.util.ArrayList;
import java.util.List;

public class CommentaryObject implements Subject, Commentary {
    private List<Observer> observerList = new ArrayList<>();
    private String commentary;

    public CommentaryObject(String commentary) {
        this.commentary = commentary;

    }

    @Override
    public void setCommentary(String commentary) {
        this.commentary=commentary;
        notifyObservers();
    }

    @Override
    public String getCommentary() {
        return this.commentary;
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.stream().forEach(f->{
            f.update(getCommentary());
        });
    }

    @Override
    public String subjectDetails() {
        return getCommentary();
    }
}
