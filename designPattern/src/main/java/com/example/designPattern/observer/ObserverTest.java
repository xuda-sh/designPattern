package com.example.designPattern.observer;

import com.example.designPattern.observer.impl.CommentaryObject;
import com.example.designPattern.observer.impl.SmsUser;
import com.example.designPattern.observer.service.Commentary;
import com.example.designPattern.observer.service.Observer;
import com.example.designPattern.observer.service.Subject;

public class ObserverTest {
    public static void main(String[] args) {
        Subject subject=new CommentaryObject("Soccer Match [2014AUG24]");
        Observer observer=new SmsUser(subject,"Adam watcher [New York]");
        observer.subscribe();
        System.out.println();

        Observer observer2=new SmsUser(subject,"Tim Ronney [London]");
        observer2.subscribe();

        Commentary cObject= (Commentary) subject;
        cObject.setCommentary("Welcome to live Soccer match");
        cObject.setCommentary("Current score 0-0");
        System.out.println();

        observer2.unSubscribe();
        System.out.println();

        cObject.setCommentary("It's  a goal!!!");
        cObject.setCommentary("Current score 1-0");
        System.out.println();

        Observer observer3=new SmsUser(subject,"Marrie [Paris]");
        observer3.subscribe();
        System.out.println();

        cObject.setCommentary("It's another goal!!!");
        cObject.setCommentary("Half-time score 2-0");
    }
}
