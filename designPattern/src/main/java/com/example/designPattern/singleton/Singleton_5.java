package com.example.designPattern.singleton;

public class Singleton_5 {
    private static Singleton_5 INSTANCE;

    private Singleton_5() {
    }

    public static Singleton_5 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton_5.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Singleton_5();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Singleton_5.getInstance().hashCode())).start();
        }
    }
}
