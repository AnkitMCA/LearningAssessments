/*

Ques.8 Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer.

*/

import java.util.Scanner;

public class Ques8 {

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string of more than 9 characters : ");
        sbf.append(input.nextLine());
        StringBuffer result=sbf.reverse();

        System.out.println("Substring : "+result.replace(4,9,""));

    }
}
