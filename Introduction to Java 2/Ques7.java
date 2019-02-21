/*

Ques.7 WAP to convert seconds into days, hours, minutes and seconds.

*/

import java.util.Scanner;

public class Ques7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the seconds in digits : ");
        int seconds = sc.nextInt();

        int days = seconds / (24*60*60);
        int hours = (seconds % 86400 ) / 3600 ;
        int minutes = ((seconds % 86400 ) % 3600 ) / 60 ;
        seconds = ((seconds % 86400 ) % 3600 ) % 60  ;

        System.out.println(days+" days "+hours+" hours "+minutes+" minutes "+seconds+" seconds ");


    }
}
