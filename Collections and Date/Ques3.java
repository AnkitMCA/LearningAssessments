/*

Ques.3 Write a method that takes a string and print the number of occurrence of each character characters in the string.

*/

import java.util.HashMap;
import java.util.Scanner;

public class Ques3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> mymap = new HashMap<>();
        System.out.println("Enter a String : ");
        String str = sc.next();
        char ch[] = str.toCharArray();

        for (char c : ch) {
            if (mymap.containsKey(c)) {
                mymap.put(c, mymap.get(c) + 1);
            }
            else {
                mymap.put(c,1);
            }
        }
        System.out.println(mymap);
    }
}