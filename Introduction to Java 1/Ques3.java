/*

Ques.3 Write a program to find the number of occurrences of a character in a string without using loop.

*/

import java.util.Scanner;

public class Ques3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next().toLowerCase();
        System.out.println("Enter character for counting occurence " + str);
        char c = sc.next(".").toLowerCase().charAt(0);
        int cn = str.length() - str.replaceAll(String.valueOf(c), "").length();
        System.out.println("Occurence of "+ c + " in " + str + " is " + cn);
        sc.close();

    }
}