package com.rahul.designpatterndemo.problems.multi_threading.example1;

public class RunnableB implements Runnable {
    private Thread3 thread3;


    RunnableB(Thread3 thread3) {
        this.thread3 = thread3;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            thread3.print(i);
            if (i == 100) {
                thread3.start();
            }
        }
    }
}
