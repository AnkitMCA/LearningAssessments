/*

Ques.9 Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().

*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques9 {

    public static void main(String args[]) {

//        ExecutorService service = Executors.newCachedThreadPool();
        ExecutorService service = Executors.newFixedThreadPool(2);
        try {
            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1" + Thread.currentThread().getName());
                }
            });

            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2" + Thread.currentThread().getName());
                }
            });

            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 3" + Thread.currentThread().getName());
                }
            });

            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 4" + Thread.currentThread().getName());
                }
            });

            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 5" + Thread.currentThread().getName());
                }
            });
        }finally {
            service.shutdown();
        }

        System.out.println("Main Thread Executed");

    }
}
