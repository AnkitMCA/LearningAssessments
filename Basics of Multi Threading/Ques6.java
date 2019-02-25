/*

Ques.6 Return a Future from ExecutorService by using callable and use get(), isDone(), isCancelled() with the Future object to know the status of task submitted.

*/


import java.util.concurrent.*;

public class Ques6 {

    public static void main(String[] args) {


        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> future = service.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        });

        try {

            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Demo Thread 1- " + Thread.currentThread().getName());
                }
            });


        } finally {
            service.shutdown();
        }


        if (future.isDone()) {
            System.out.print("Get Future Value : ");
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        if (future.isCancelled()) {
            System.out.println("Task Cancelled");
        }

        System.out.println("Main Thread Executed.");
    }
}
