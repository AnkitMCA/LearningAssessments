/*
 *
 * Ques.8 Implement multiple inheritance with default method inside  interface.
 *
 * */

interface Parent1 {
    default void display1() {
        System.out.println("This is Parent1.");
    }
}

interface Parent2 {
    default void display2() {
        System.out.println("This is Parent2.");
    }
}

interface Parent3 extends Parent1,Parent2 {
    default void display() {
        System.out.println("This is Parent3.");
    }
}

public class Ques8 implements Parent3{
    public static void main(String[] args) {

        Ques8 ques8 = new Ques8();
        ques8.display();
        ques8.display1();
        ques8.display2();
    }
}