package com.example.designpatterndemo.design_patterns.creational_pattern.singleton_pattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*This is a solution to Reflection breach of singleton class*/
enum SingletonFactory {
    INSTANCE;

    public static SingletonFactory getInstance() {
        return INSTANCE;
    }

    protected void display() {
        System.out.println("Inside enum SingletonFactory:: Display() method");
    }
}

/**
 * Singleton Pattern says that just"define a class that has only
 * one instance and provides a global point of access to it".
 * <p>
 * In other words, a class must ensure that only single instance
 * should be created and single object can be used by all other classes.
 * <p>
 * There are two forms of singleton design pattern
 * <p>
 * Early Instantiation: creation of instance at load time.
 * Lazy Instantiation: creation of instance when required.
 * <p>
 * If singleton class is loaded by two class-loaders,
 * two instance of singleton class will be created, one for each class-loader.
 */
public class SingleObject implements Serializable, Cloneable {

//    private static SingleObject earlyInitialization = new SingleObject();//Early, instance will be created at load time

    private static SingleObject singleObject;

    private SingleObject() {
    }

    public static SingleObject getInstance() {
//        SingletonFactory sig = SingletonFactory.getInstance();
//        sig.display();
        if (singleObject == null) {
            synchronized (SingleObject.class) {
                if (singleObject == null) {
                    singleObject = new SingleObject(); //Lazy, instance will be created at load time
                }
            }
        }
        return singleObject;
    }

    /**
     * A Good example of this method is defined here.
     * <p>
     * https://www.javalobby.org//java/forums/t17491.html
     *
     * @return object
     * @throws ObjectStreamException exception
     */
    protected Object readResolve() throws ObjectStreamException {
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //throw new CloneNotSupportedException("Clone not supported");
        return getInstance();
    }

    void display() {
        System.out.println("Inside SingleObject:: Display() method: " + this.hashCode());
    }
}
