package com.example.designPattern.observer.impl;

import com.example.designPattern.observer.service.Observer;
import com.example.designPattern.observer.service.Subject;

public class SmsUser implements Observer {
    private Subject subject;
    private String commentary;
    private String userInfo;

    public SmsUser(Subject subject, String userInfo) {
        if(subject==null){
            throw  new IllegalArgumentException("No Publisher found.");
        }
        this.subject = subject;
        this.userInfo = userInfo;
    }

    @Override
    public void update(String commentary) {
        this.commentary=commentary;
        display();

    }

    @Override
    public void subscribe() {
        System.out.println("Subscribe "+userInfo+" to "+subject.subjectDetails()+".......");
        subject.subscribeObserver(this);
        System.out.println("Subscribed successfully");

    }

    @Override
    public void unSubscribe() {
        System.out.println("UnSubscribing "+userInfo+" to "+subject.subjectDetails()+".......");
        subject.unSubscribeObserver(this);
        System.out.println("UnSubscribed successfully");
    }

    public void display(){
        System.out.println("["+userInfo+"]: "+this.commentary);
    }
}
