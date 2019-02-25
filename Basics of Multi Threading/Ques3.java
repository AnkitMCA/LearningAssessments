/*

Ques.3 Use a singleThreadExecutor to submit multiple threads.

*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques3 {

    public static void main(String[] args) {


        ExecutorService executorService = Executors.newSingleThreadExecutor();

        try {

            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1- " + Thread.currentThread().getName());
                }
            });

            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2- " + Thread.currentThread().getName());
                }
            });

            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 3- " + Thread.currentThread().getName());
                }
            });

        }finally {
            executorService.shutdown();
        }


        System.out.println("Main Thread Executed.");

    }
}
