/*
*
* Ques.12 Find the first even number in the integer list which is greater than 3.
 *
* */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ques12 {
    public static void main(String args[]) {

        List<Integer> list = Arrays.asList(1, 2, 3, 5, 7, 2, 8);
        Optional<Integer> result = list.stream().filter(a -> a > 3 && (a % 2 == 0)).findFirst();
        if (result.isPresent()) {
            System.out.println("" + result.get());
        } else {
            System.out.println("No Value");
        }
    }
}
