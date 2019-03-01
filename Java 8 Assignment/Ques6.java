/*
 *
 * Ques.6 Create and access default and static method of an interface.
 *
 * */

interface Car {
    static void running() {
        System.out.println("Car is Running..");
    }

    default void consume() {
        System.out.println("Car consume Petrol..");
    }
}

class BMW implements Car {

    void price() {
        System.out.println("BMW price is very much");
    }

}

public class Ques6 {
    public static void main(String[] args) {
        Car.running();

        BMW bmw = new BMW();
        bmw.consume();
        bmw.price();

    }
}