package com.example.designPattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton_6_Test implements Serializable{
    public static void main(String[] args) {
        //        for (int i = 0; i < 1000; i++) {
//            new Thread(() -> System.out.println(Singleton_6.getInstance().hashCode())).start();
//        }
        Singleton_6 singleton_6 = Singleton_6.getInstance();
//        Class<Singleton_6> singletonClass= null;
//        try {
//            singletonClass = (Class<Singleton_6>) Class.forName("com.example.designPattern.singleton.Singleton_6");
//            Constructor<Singleton_6> constructor= singletonClass.getDeclaredConstructor(null);
//            constructor.setAccessible(true);
//            Singleton_6 singleton_6ByReflect=constructor.newInstance();
////            System.out.println("singleton_6:"+singleton_6);
//            System.out.println("singleton_6ByReflect:"+singleton_6ByReflect);
////            System.out.println("singleton_6==singleton_6ByReflect:"+(singleton_6==singleton_6ByReflect));
//        } catch (ClassNotFoundException | NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }

        ObjectOutputStream oos=null;
        try {
            oos=new ObjectOutputStream(new FileOutputStream("tempFile.txt"));
            oos.writeObject(singleton_6);

            File file=new File("tempFile.txt");
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
            Singleton_6 singleton_6BySerialize= (Singleton_6) ois.readObject();
            System.out.println("singleton6:"+singleton_6);
            System.out.println("singleton_6BySerialize:"+singleton_6BySerialize);
            System.out.println("singleton6==singleton_6BySerialize:"+(singleton_6==singleton_6BySerialize));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
