package com.example.designPattern.singleton;

import java.util.concurrent.atomic.AtomicReference;

public class Singleton_9 {
    private static final AtomicReference<Singleton_9> INSTANCE=new AtomicReference<>();

    private Singleton_9 (){

    }

    public  static  Singleton_9 getInstance(){
        for(;;){
            Singleton_9 singleton_9=INSTANCE.get();
            if(singleton_9!=null){
                return singleton_9;
            }
            singleton_9=new Singleton_9();
            if(INSTANCE.compareAndSet(null,singleton_9)){
                return singleton_9;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            System.out.println();
            new Thread(() -> System.out.println(Singleton_9.getInstance().hashCode())).start();
        }
    }
}
