package com.example.designpatterndemo.design_patterns.creational_pattern.singleton_pattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        SingleObject singleObject2 = SingleObject.getInstance();
        singleObject.display();
        singleObject2.display();

        //METHOD 1:-- break singleton by Reflection API
        try {
            Constructor[] constructors =
                    SingleObject.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                singleObject2 = (SingleObject) constructor.newInstance();
                break;
            }
            //solution to this is Enum make it enum
            System.out.println("Reflection instance1.hashCode():- " + singleObject.hashCode());
            System.out.println("Reflection instance2.hashCode():- " + singleObject2.hashCode());


            SingletonFactory singletonFactory = SingletonFactory.INSTANCE;
            SingletonFactory singletonFactory2 = SingletonFactory.INSTANCE;

            //solution to this is Enum-make it enum
            System.out.println("Reflection solution instance1.hashCode():- " + singletonFactory.hashCode());
            System.out.println("Reflection solution instance2.hashCode():- " + singletonFactory2.hashCode());
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        } catch (InstantiationException e1) {
            e1.printStackTrace();
        } catch (InvocationTargetException e1) {
            e1.printStackTrace();
        }


        //METHOD 2-- Break singleton by serializable
        try {
            SingleObject instance1 = SingleObject.getInstance();
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();

            // deserialize from file to object
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));

            SingleObject instance2 = (SingleObject) in.readObject();
            in.close();

            // Solution to this is override readResolve method
            System.out.println("Serializable instance1 hashCode:- " + instance1.hashCode());
            System.out.println("Serializable instance2 hashCode:- " + instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //METHOD 3-- Break singleton by cloneable
        try {
            SingleObject instance1 = SingleObject.getInstance();
            SingleObject instance2 = (SingleObject) instance1.clone();

            //Solution to this is override clone method and implements Cloneable interface and throw exception of same object
            System.out.println("Cloneable instance1 hashCode:- " + instance1.hashCode());
            System.out.println("Cloneable instance2 hashCode:- " + instance2.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
