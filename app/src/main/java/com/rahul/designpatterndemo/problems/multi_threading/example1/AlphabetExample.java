package com.rahul.designpatterndemo.problems.multi_threading.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlphabetExample {

    public static void main(String[] args) {

//        List<Integer> integers =Arrays.asList(1, 2, 3, 4, 5, 6);
//        integers.add(10);
//        System.out.println(integers);

        Thread3 C = new Thread3();

        RunnableA R1 = new RunnableA(C);
        RunnableB R2 = new RunnableB(C);

        Thread A = new Thread(R1);
        Thread B = new Thread(R2);

        A.start();
        B.start();


  /*
  final Number number = new Number(3);
    Thread t1 = new Thread() {
            @Override
            public void run() {
                try {
                    number.printAlphabets();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                try {
                    number.printNumbers();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t1.start();
        t2.start();*/
    }
}
