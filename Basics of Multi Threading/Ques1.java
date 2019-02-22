/*

Ques.1 Create and Run a Thread using Runnable Interface and Thread class.

*/


class MyThread extends Thread{

    public void run(){
        System.out.println("Thread 1 is created using Thread class");
    }
}

class MyThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread 2 is created using Runnable Interface");
    }
}

public class Ques1 {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        thread1.start();

        MyThread2 thread2 = new MyThread2();
        new Thread(thread2).start();
    }

}
