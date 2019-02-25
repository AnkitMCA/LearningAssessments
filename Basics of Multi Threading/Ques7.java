/*

Ques.7 Submit List of tasks to ExecutorService and wait for the completion of all the tasks.

*/


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Ques7 {

    public static void main(String[] args) {

        List<Callable<Integer>> joblist = new ArrayList<>();

        joblist.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 4;
            }
        });

        joblist.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 5;
            }
        });

        joblist.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 6;
            }
        });

        joblist.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 7;
            }
        });

        ExecutorService service = Executors.newSingleThreadExecutor();

        List<Future<Integer>> futureList = null;
        try {
            futureList = service.invokeAll(joblist);


            for (Future f : futureList) {
                if (f.isDone()) {
                    try {
                        System.out.println("Future return value : " + f.get());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // ShutDown the ExecutorService
            service.shutdown();
        }
    }
}
