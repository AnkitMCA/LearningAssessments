/*

Ques.16 Create a deadlock and Resolve it using tryLock().

*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ques16 {

    Lock lock1 = new ReentrantLock(true);
    Lock lock2 = new ReentrantLock(true);

    void acquirelock(Lock lock1, Lock lock2){
        boolean trylock1 = lock1.tryLock();
        boolean trylock2 = lock2.tryLock();

        if(trylock1 && trylock2){
            return;
        }else if(trylock1){
            lock1.unlock();
        }else{
            lock2.unlock();
        }
    }


    public void task1(){
        acquirelock(lock1,lock2);
        System.out.println("Task 1 Started");
        System.out.println("Task 1 END");
        lock2.unlock();
        lock1.unlock();
    }

    public void task2(){
        acquirelock(lock2,lock1);
        System.out.println("Task 2 Started");
        System.out.println("Task 2 END");
        lock1.unlock();
        lock2.unlock();
    }

    public static void main (String[] args) throws InterruptedException {
        Ques16 obj = new Ques16();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.task1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.task2();
            }
        });
        t1.start();
        t2.start();

    }
}
