package com.example.designPattern.singleton;

public class Singleton_4 {
    private static Singleton_4 INSTANCE;
    private Singleton_4(){
    }

    public static synchronized Singleton_4 getInstance(){
        if (INSTANCE==null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE=new Singleton_4();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()-> System.out.println(Singleton_4.getInstance().hashCode())).start();
        }
    }
}
