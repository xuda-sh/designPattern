package com.example.designPattern.singleton;

public class Singleton_2 {
    private static Singleton_2 singleton_2;
    static {
        singleton_2=new Singleton_2();
    }
    private Singleton_2(){

    }
    public static Singleton_2 getInstance(){
        return singleton_2;
    }

    public static void main(String[] args) {
        Singleton_2 singleton_2=Singleton_2.getInstance();
        Singleton_2 singleton_21=Singleton_2.getInstance();
        System.out.println(singleton_21==singleton_2);
    }
}
