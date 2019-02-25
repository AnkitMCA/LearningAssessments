/*

Ques.1 Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.

*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ques1 {

    public static void main(String args[]) {

        List<Float> list = new ArrayList();

        list.add(1.23f);
        list.add(2.23f);
        list.add(3.23f);
        list.add(4.23f);
        list.add(5.23f);

        float sum = 0;
        Iterator<Float> iterator = list.iterator();
        while (iterator.hasNext()){
            //float value = Float.parseFloat(iterator.next().toString());
            float value = (float)iterator.next();
            sum += value;
        }
        System.out.println("Sum : "+sum);
    }

}
