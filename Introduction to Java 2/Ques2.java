/*

Ques.2 WAP to sorting string without using string Methods?.

*/

import java.util.Scanner;

public class Ques2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next().toLowerCase();
        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            for (int j = i+1; j < ch.length ; j++) {
                if (ch[j] < ch[i]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        System.out.println("Sorted String : "+String.valueOf(ch));
    }
}
