/*

Ques.14 Coordinate mulitple threads using wait() and notifyAll()

*/

public class Ques14 {

    public void user1(){
        synchronized (this) {
            System.out.println("User 1 Task Started");
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
            System.out.println("User 2 Task Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("User 2 Complete Task");
        }
    }

    public void user3(){
        synchronized (this) {
            System.out.println("User 3 Task Started");
            System.out.println("User 3 Complete Task");
            notifyAll();
        }
    }

    public static void main(String args[]) {

        Ques14 obj = new Ques14();

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

        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.user3();
            }
        }).start();

    }
}
