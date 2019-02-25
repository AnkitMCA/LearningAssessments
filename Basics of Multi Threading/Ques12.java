/*

Ques.12 Use Atomic Classes instead of Synchronize method and blocks.

*/


import java.util.concurrent.atomic.AtomicInteger;

public class Ques12 {

    AtomicInteger count = new AtomicInteger();


    public void countIncrement() {
        // Syschronized Block
        synchronized (this) {
                count.incrementAndGet();
            }
        }

    public void user1() {
        for (int i = 0; i < 100; i++) {
            countIncrement();
        }
    }

    public void user2() {
        for (int i = 0; i < 100; i++) {
            countIncrement();
        }
    }

    public static void main(String args[]) {

        Ques12 obj = new Ques12();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.user1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.user2();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(obj.count + " : Thread Executed using AtomicInteger ");
    }
}
