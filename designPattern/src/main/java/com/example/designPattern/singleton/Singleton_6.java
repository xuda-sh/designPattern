package com.example.designPattern.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class Singleton_6 implements Serializable{
    private static volatile Singleton_6 INSTANCE;

    private Singleton_6() {
        if(INSTANCE!=null){
            throw new RuntimeException("Singleton constructor is called...");
        }
    }

    private Object readResolve() {
        return getInstance();
    }

    public static Singleton_6 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton_6.class) {
                if(INSTANCE==null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Singleton_6();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        for (int i = 0; i < 1000; i++) {
//            new Thread(() -> System.out.println(Singleton_6.getInstance().hashCode())).start();
//        }
        Singleton_6 singleton_6 = Singleton_6.getInstance();
//        Class<Singleton_6> singletonClass= (Class<Singleton_6>) Class.forName("com.example.designPattern.singleton.Singleton_6");
//        Constructor<Singleton_6> constructor= singletonClass.getDeclaredConstructor(null);
//        constructor.setAccessible(true);
//        Singleton_6 singleton_6ByReflect=constructor.newInstance();
//        System.out.println("singleton_6:"+singleton_6);
//        System.out.println("singleton_6ByReflect:"+singleton_6ByReflect);
//        System.out.println("singleton_6==singleton_6ByReflect:"+(singleton_6==singleton_6ByReflect));
//        ObjectOutputStream oos=null;
//        try {
//            oos=new ObjectOutputStream(new FileOutputStream("tempFile"));
//            oos.writeObject(singleton_6);
//
//            File file=new File("tempFile");
//            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
//            Singleton_6 singleton_6BySerialize= (Singleton_6) ois.readObject();
//            System.out.println("singleton6:"+singleton_6);
//            System.out.println("singleton_6BySerialize:"+singleton_6BySerialize);
//            System.out.println("singleton6==singleton_6BySerialize:"+(singleton_6==singleton_6BySerialize));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
