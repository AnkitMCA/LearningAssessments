/*

Ques.4 Try shutdown() and shutdownNow() and observe the difference.

*/


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques4 {

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

            service.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Demo Thread 3- " + Thread.currentThread().getName());
                }
            });


        } finally {
            service.shutdownNow();
        }


        System.out.println("Main Thread Executed.");

    }
}
