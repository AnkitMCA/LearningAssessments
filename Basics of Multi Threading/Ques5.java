/*

Ques.5 Use isShutDown() and isTerminate() with ExecutorService.

*/


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques5 {

    public static void main(String[] args) {


        ExecutorService service = Executors.newSingleThreadExecutor();

        try {

            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Demo Thread 1- " + Thread.currentThread().getName());
                }
            });

            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Demo Thread 2- " + Thread.currentThread().getName());
                }
            });


        } finally {
            service.shutdown();
        }

        System.out.println(service.isShutdown());
        System.out.println(service.isTerminated());

        System.out.println("Main Thread Executed.");

    }
}
