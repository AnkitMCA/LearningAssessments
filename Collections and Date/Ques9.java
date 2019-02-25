/*

Ques.9 Write a program to display times in different country format.

*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Ques9 {

    public static void main(String args[]) {

        Date date = new Date();
        DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");

        formatter.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta"));
        System.out.println("Asia/Calcutta TimeZone : "+formatter.format(date));

        formatter.setTimeZone(TimeZone.getTimeZone("US/Central"));
        System.out.println("US/Central TimeZone : "+formatter.format(date));

        formatter.setTimeZone(TimeZone.getTimeZone("Asia/Hong_Kong"));
        System.out.println("Asia/Hong_Kong TimeZone : "+formatter.format(date));

        formatter.setTimeZone(TimeZone.getTimeZone("Europe/Istanbul"));
        System.out.println("Europe/Istanbul TimeZone : "+formatter.format(date));


    }

}
