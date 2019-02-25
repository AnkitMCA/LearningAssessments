/*

Ques.6 Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.

*/

import java.util.*;

public class Ques6 {

    public static void main(String args[]) {

        Integer[] arr = {0, 1, 6, 2, 3, 4, 5, 3, 2, 1, 4, 6, 3, 7, 5, 6, 3, 2, 5, 2};

        List<Integer> arrayList = new ArrayList(Arrays.asList(arr));
        Map<Integer, Integer> mymap = new LinkedHashMap<>();

        ListIterator<Integer> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()) {
            int t1 = listIterator.next();
            mymap.put(t1, Collections.frequency(arrayList, t1));
        }

        List<Map.Entry<Integer, Integer>> listSort = new ArrayList<>(mymap.entrySet());

        Collections.sort(listSort, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : listSort) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sorted Elements: ");
        for (Integer i : sortedMap.keySet()) {
            System.out.println("Element : " + i + " Frequency : " + sortedMap.get(i));
        }
    }
}
