/*
 *
 * Ques.5 Implement following functional interfaces from java.util.function using lambdas:
(1) Consumer
(2) Supplier
(3) Predicate
(4) Function
 *
 * */


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Employees{
    static private String companyLocation = "New Delhi";
    static String  getCompanyLocation(){
        return companyLocation;
    }
}

public class Ques5 {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Consumer Demo");

        Supplier<String> supplier = Employees::getCompanyLocation;
        System.out.println("Supplier -> " + supplier.get());

        Predicate<Integer> predicate = a -> a > 5;
        System.out.println("Predicate -> " + predicate.test(23));
        System.out.println("Predicate -> " + predicate.test(3));

        Function<String, String> function = String::toUpperCase;
        System.out.println("Function -> " + function.apply("Example"));
    }
}