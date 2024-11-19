package com.rahul.designpatterndemo.problems.multi_threading.example1;

public class Thread3 extends Thread {
    private final Object syncher = new Object();  // we use an explicit synch Object, you could use annotation on methods, too.
    private StringBuilder builder;
    // explicit allows to deal with more complex situations, especially you could have more the one locking Object
    private int state = 0; // 0 allows chars, 1 allows ints
    private int count = 0;

    Thread3() {
        builder = new StringBuilder();
    }

    @Override
    public void run() {
        System.out.println(builder.toString());
    }

    public void print(char pChar) {
        synchronized (syncher) {      // prevent the other print to access state
            while (true) {
                if (state == 0) {     // char are allowed
                    builder.append(pChar);
                    if (pChar != 'z')
                        builder.append(",");
//                    System.out.print(pChar + ","); // print it
                    if (count != 3) {
                        state = 1;        // now allow ints
                        count = 0;
                    }
                    syncher.notify(); // wake up all waiting threads
                    return;
                } else {              // not allowed for now
                    try {
                        syncher.wait();  // wait on wake up
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }

    public void print(int pInt) {
        synchronized (syncher) {
            while (true) {
                if (state == 1) {
                    builder.append(pInt).append(",");
//                    System.out.print(pInt + ",");
                    if (count == 3) {
                        state = 0;
                    }
                    count++;
                    syncher.notify();
                    return;
                } else {
                    try {
                        syncher.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }


}
