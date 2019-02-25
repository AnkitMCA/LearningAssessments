/*

Ques.8 Write a program to format date as example "21-March-2016"

*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ques8 {
    public static void main(String args[]) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String strDate= dateFormat.format(date);
        System.out.println(strDate);
    }
}
