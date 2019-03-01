/*
 *
 * Ques.9 Collect all the even numbers from an integer list.
 *
 * */

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ques9 {
    public static void main(String[] args) {
        List<Integer> integerList;
        IntStream intStream = IntStream.rangeClosed(1, 50);
        integerList = intStream.filter(value -> value%2 == 0).boxed().collect(Collectors.toList());
        System.out.println(integerList);

    }
}