/*

Ques.10  Use Synchronize method to enable synchronization between multiple threads trying to access method at same time.

 */

public class Ques10{

    int count;

    synchronized public void countIncrement(){
        count++;
    }

    public void user1(){
        for (int i = 0; i < 1000; i++) {
            countIncrement();
        }
    }

    public void user2(){
        for (int i = 0; i < 1000; i++) {
            countIncrement();
        }
    }

    public static void main(String args[]) {

        Ques10 obj = new Ques10();

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

        System.out.println(obj.count + " : Thread " + Thread.currentThread().getName());
    }
}
