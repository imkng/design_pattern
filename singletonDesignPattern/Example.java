package singletonDesignPattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
//        // Somosa somosa = new Somosa();
//        Somosa somosa = Somosa.getSomosa();
//        System.out.println(somosa.hashCode());
//        Somosa somos2 = Somosa.getSomosa();
//        System.out.println(somos2.hashCode());
//
//        System.out.println("================================");
//        Jalebi jalebi = Jalebi.getJalebi();
//        Jalebi jalebi1 = Jalebi.getJalebi();
//        System.out.println(jalebi1.hashCode());
//        System.out.println(jalebi.hashCode());

        /* Reflection API To break singleton pattern
        *   Solution: 1. If there is an object exist we will throw the exception in constructor
        *
        *  Deserialization can also break Singleton design pattern
        *
        *
        * */
//        Somosa s1 = Somosa.getSomosa();
//        System.out.println(s1.hashCode());
//
//        Constructor<Somosa> constructor = Somosa.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Somosa s2 = constructor.newInstance();
//        System.out.println(s2.hashCode());

        Somosa somosa = Somosa.getSomosa();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("ab.txt"));
        objectOutputStream.writeObject(somosa);
        System.out.println(somosa.hashCode());

        System.out.println("serialization has been done!!!");

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("ab.txt"));
        Somosa somosa1 = (Somosa) objectInputStream.readObject();
        System.out.println(somosa1.hashCode());
    }
}
