/*
 *
 * Ques.3 Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication method for the functional interface created.
 *
 * */

import java.util.function.BiFunction;

@FunctionalInterface
interface Adder{
    int add(int a, int b);
}

@FunctionalInterface
interface Subtractor{
    int subtract(int a, int b);
}

@FunctionalInterface
interface Multiplier{
    void display();
    static int multiply(int a, int b){
        return (a*b);
    }
}

class Calculate implements Adder, Subtractor{
    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
}

public class Ques3 {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        BiFunction<Integer, Integer, Integer> biFunction = calculate::add;
        System.out.println("Addition: " + biFunction.apply(12,31));

        Subtractor subtractor = calculate::subtract;
        System.out.println("Subtraction: " + subtractor.subtract(41, 32));

        biFunction = Multiplier::multiply;
        System.out.println("Multiplication: " + biFunction.apply(7,9));
    }
}