/*

Ques.8 WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a
a)while statement
b)do-while statement

*/

import java.util.Scanner;

public class Ques8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, i = 0;
        System.out.println("Enter a String : ");
        String str[] = new String[100];
        while(true){
            str[count] = sc.nextLine();
            if(str[count].equals("done")){
                break;
            }
            count++;
        }

        for(i = 0 ; i <= count-1 ; i++)
            System.out.print(" " + str[i]);

        for(i = 0 ; i <= count-1 ; i++){
            if(str[i].charAt(0) == str[i].charAt(str[i].length()-1))
                System.out.println("\nFirst and last Character of word '" + str[i] + "' are same");
        }
    }
}
