/*

Ques.8 Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay().

*/

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ques8 {

    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        service.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 will be executed after 2 seconds.");
            }
        }, 2, TimeUnit.SECONDS);

        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 will be executed after fixed interval.");
            }
        }, 1, 2, TimeUnit.SECONDS);

        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 3 will be executed after last thread execute and delay is added into it.");
            }
        }, 1, 2, TimeUnit.SECONDS);

    }
}
