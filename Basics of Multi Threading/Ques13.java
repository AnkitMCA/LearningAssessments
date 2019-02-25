/*

Ques.13 Coordinate 2 threads using wait() and notify().

*/

public class Ques13 {

    public void user1(){
        synchronized (this) {
            System.out.println("User 1 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("User 1 Complete Task");
        }
    }

    public void user2(){
        synchronized (this) {
            System.out.println("User 2 Started");
            System.out.println("User 2 Complete Task");
            notify();
        }
    }

    public static void main(String[] args) {

        Ques13 obj = new Ques13();

        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.user1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.user2();
            }
        }).start();
    }
}
