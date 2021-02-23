package com.example.designPattern.singleton;

public class Singleton_10 {
    private static final ThreadLocal<Singleton_10> SINGLETON= ThreadLocal.withInitial(() -> new Singleton_10(){});

    private static Singleton_10 getInstance(){
        return SINGLETON.get();
    }

    private Singleton_10(){}

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println();
            new Thread(() -> System.out.println(Singleton_10.getInstance().hashCode())).start();
        }
    }
}
