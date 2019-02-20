/*

Ques.1 Write a program to replace a substring inside a string with other string.

*/

public class Ques1 {
    public static void main(String args[]) {
        String str = "Money";
        String tobereplace = "H";

        String result = str.replace("M",tobereplace);

        System.out.println("Final Output : "+result);


    }
}
