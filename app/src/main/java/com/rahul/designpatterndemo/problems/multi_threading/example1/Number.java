package com.rahul.designpatterndemo.problems.multi_threading.example1;

public class Number {
    //    private boolean isWait;
    private int count = 0;
    private int c = 0;

    Number(/*boolean isWait,*/ int count) {
//        this.isWait = isWait;
        this.c = count;
    }

    synchronized String printNumbers() throws InterruptedException {
        String s = null;
        for (int i = 1; i < 100; i++) {
            while (/*!isWait*/ count == c) {
                wait();
            }
            s = i + " ";
            //System.out.print(i + " ");
            notifyAll();
//            isWait = false;
            count++;
        }
        return s;
    }

    synchronized String printAlphabets() throws InterruptedException {
        String s = null;
        for (int i = 'A'; i < 'Z'; i++) {
            while (/*isWait*/count != 3) {
                wait();
            }
            s = ((char) i) + "";
//            System.out.println((char) i);
            notifyAll();
            count = 0;
//            isWait = true;
        }
        return s;
    }
}
