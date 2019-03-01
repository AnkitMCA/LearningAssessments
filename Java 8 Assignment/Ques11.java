/*
 *
 * Ques.11 Find average of the number inside integer list after doubling it.
 *
 * */

import java.util.Arrays;
import java.util.List;

public class Ques11 {
    public static void main(String args[]) {
        Integer[] myarr = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(myarr);
        Double result = list.stream().mapToInt(x -> x * 2).average().getAsDouble();
        System.out.println("Average of Numbers in Stream : " + result);
    }
}
