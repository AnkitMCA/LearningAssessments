/*

Ques.4 Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String.

*/

import java.util.Scanner;

public class Ques4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();
        int lcount = 0, ucount = 0, dcount = 0, spcount = 0;
        float len = str.length();

        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lcount++;
            } else if (Character.isUpperCase(c)) {
                ucount++;
            } else if (!Character.isAlphabetic(c)) {
                spcount++;
            } else if (Character.isDigit(c)) {
                dcount++;
            }
        }

        System.out.println("Lower Case : " + lcount);
        System.out.println("Lower Case % : " + ((lcount) / len) * 100);

        System.out.println("Upper Case : " + ucount);
        System.out.println("Upper Case % : " + ((ucount) / len) * 100);

        System.out.println("Digits : " + spcount);
        System.out.println("Digits % : " + ((spcount) / len) * 100);

        System.out.println("Special Symbols : " + spcount);
        System.out.println("Special Symbols % : " + ((spcount) / len) * 100);

    }

}
