package com.example.designPattern.singleton;

public enum Singleton_8 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Singleton_8.INSTANCE.hashCode())).start();
        }
    }
}
