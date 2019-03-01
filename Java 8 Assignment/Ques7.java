/*
 *
 * Ques.7 Override the default method of the interface.
 *
 * */

interface CarDemo{
    default void running(){
        System.out.println("Car is running..");
    }
}

class Audi implements CarDemo{
    @Override
    public void running() {
        System.out.println("Audi run very fast..");
    }
}

public class Ques7 {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.running();
    }
}