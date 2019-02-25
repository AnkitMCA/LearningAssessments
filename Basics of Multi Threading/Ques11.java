/*

Ques.11 Use Synchronize block to enable synchronization between multiple threads trying to access method at same time.

*/


public class Ques11{

    int count;
    int count1;

    public void countIncrement(){
        count1++;
        //This area is for async tasks
        synchronized (this) {
            //This is synchronized block
            count++;
        }
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

        Ques11 obj = new Ques11();

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

        System.out.println(obj.count + " : Synchronized Block ");
        System.out.println(obj.count1 + " : Asynchronized Block ");


    }
}
