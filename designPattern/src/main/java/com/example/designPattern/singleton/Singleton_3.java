package com.example.designPattern.singleton;

public class Singleton_3 {
    private static Singleton_3 INSTANCE;
    private Singleton_3(){
    }

    public static Singleton_3 getInstance(){
        if (INSTANCE==null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE=new Singleton_3();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()-> System.out.println(Singleton_3.getInstance().hashCode())).start();
        }
    }
}
