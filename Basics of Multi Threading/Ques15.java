/*

Ques.15 Use Reentract lock for coordinating 2 threads with signal(), signalAll() and wait().

*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ques15 {

    int count;
    Lock lock = new ReentrantLock(true);

    public void countIncrement(){
        lock.lock();
        count++;
        lock.unlock();
    }

    public void user1(){
        for (int i = 0; i < 101; i++) {
            countIncrement();
        }
    }

    public void user2(){
        for (int i = 0; i < 101; i++) {
            countIncrement();
        }
    }

    public static void main(String args[]) {

        Ques15 obj = new Ques15();

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

        System.out.println(obj.count + " : Thread "+Thread.currentThread().getName());
    }
}
