/*
*
* Ques.3 Implement Abstract Factory Pattern to create cars of different categories from different countries.
 *
* */

enum CarType{
    SPORTS , SUV , MINI;
}

enum Location{
    INDIA , RUSSIA , CHINA;
}

abstract class Car {
    CarType carType;
    Location location;

    public Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }

    abstract void construct();

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}

class SportsCar extends Car {

    public SportsCar(Location location) {
        super(CarType.SPORTS, location);
    }

    @Override
    void construct() {
        System.out.println("Constructing Sports Car in "+location);
    }
}

class SUV extends Car {

    public SUV(Location location) {
        super(CarType.SUV, location);
    }

    @Override
    void construct() {
        System.out.println("Constructing SUV Car in "+location);
    }
}

class MiniCar extends Car {

    public MiniCar(Location location) {
        super(CarType.MINI, location);
    }

    @Override
    void construct() {
        System.out.println("Constructing Mini Car in "+location);
    }
}

class IndianCarFactory {
    static Car buildCar(CarType cartype) {
        Car car = null;
        switch (cartype) {
            case SUV:
                car = new SUV(Location.INDIA);
                break;
            case MINI:
                car = new MiniCar(Location.INDIA);
                break;
            case SPORTS:
                car = new SportsCar(Location.INDIA);
                break;
        }
        return car;
    }
}

class ChinaCarFactory {
    static Car buildCar(CarType cartype) {
        Car car = null;
        switch (cartype) {
            case SUV:
                car = new SUV(Location.CHINA);
                break;
            case MINI:
                car = new MiniCar(Location.CHINA);
                break;
            case SPORTS:
                car = new SportsCar(Location.CHINA);
                break;
        }
        return car;
    }
}

class RussiaCarFactory {
    static Car buildCar(CarType cartype) {
        Car car = null;
        switch (cartype) {
            case SUV:
                car = new SUV(Location.RUSSIA);
                break;
            case MINI:
                car = new MiniCar(Location.RUSSIA);
                break;
            case SPORTS:
                car = new SportsCar(Location.RUSSIA);
                break;
        }
        return car;
    }
}

class CarFactory {
    static  Car buildCar(CarType carType,Location location){
        Car car=null;
        switch (location){
            case CHINA:
                car=ChinaCarFactory.buildCar(carType);
                break;
            case INDIA:
                car=IndianCarFactory.buildCar(carType);
                break;
            case RUSSIA:
                car=RussiaCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
}

public class Ques3 {

    public static void main(String args[]) {

        Car car=CarFactory.buildCar(CarType.SUV,Location.INDIA);
        car.construct();
        Car car1=CarFactory.buildCar(CarType.MINI,Location.CHINA);
        car1.construct();
        Car car2=CarFactory.buildCar(CarType.SPORTS,Location.RUSSIA);
        car2.construct();
    }
}
