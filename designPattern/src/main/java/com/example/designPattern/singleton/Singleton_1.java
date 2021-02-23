package com.example.designPattern.singleton;

public class Singleton_1 {
    private static final Singleton_1 singleton_1=new Singleton_1();

    private Singleton_1(){

    }
    public  static  Singleton_1 getInstance(){
        return singleton_1;
    }

    public static void main(String[] args) {
        Singleton_1 singleton_1=Singleton_1.getInstance();
        Singleton_1 singleton_2=Singleton_1.getInstance();
        System.out.println(singleton_1==singleton_2);
    }
}
