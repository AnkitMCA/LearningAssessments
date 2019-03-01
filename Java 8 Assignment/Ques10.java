/*
 *
 * Ques.10 Sum all the numbers greater than 5 in the integer list.
 *
 * */

import java.util.Arrays;
import java.util.List;

public class Ques10 {
    public static void main(String[] args) {
        Integer[] arr={1,5,7,4,6,3,7,3};
        List<Integer> list = Arrays.asList(arr) ;
        Integer result = list.stream().filter(a -> a > 5).reduce(0, (a , b) -> (a + b));
        System.out.println(list);
        System.out.println("\nSum of (Num > 5) : "+ result);
    }
}