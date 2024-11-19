package com.rahul.designpatterndemo.problems.multi_threading.example1;

public class RunnableA implements Runnable {
    private Thread3 thread3;

    RunnableA(Thread3 thread3) {
        this.thread3 = thread3;
    }

    @Override
    public void run() {
        for (int i = 'a'; i <= 'z'; i++) {
            thread3.print((char) i);
        }
    }
}
