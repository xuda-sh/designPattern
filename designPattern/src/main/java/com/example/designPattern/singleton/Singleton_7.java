package com.example.designPattern.singleton;

public class Singleton_7 {

    private Singleton_7() {
    }

    private static class SingletonHolder{
        private static final Singleton_7 INSTANCE=new Singleton_7();
    }

    public static Singleton_7 getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println();
            new Thread(() -> System.out.println(Singleton_7.getInstance().hashCode())).start();
        }
    }
}
