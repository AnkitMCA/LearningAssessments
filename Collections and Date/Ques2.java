/*

Ques.2 Write a method that takes a string and returns the number of unique characters in the string.

*/

import java.util.*;

public class Ques2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();

        Set<Character> characterSet = new HashSet<>();
        for (Character ch : str.toCharArray()) {
            characterSet.add(ch);
        }

        System.out.println(characterSet);
    }

}
