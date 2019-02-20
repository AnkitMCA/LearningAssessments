/*

Ques.2 Write a program to find the number of occurrences of the duplicate words in a string and print them.

*/

public class Ques2 {

    public static void main(String args[]) {
        String str = "Java Language Java Virtual Machine Virtual Java";
        String words[] = str.split(" ");
        int count;
        System.out.println("Original String : "+str);


        System.out.println("Duplicate Words : ");
        for (int i = 0; i < words.length; i++) {
            count=1;
            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    count++;
                    words[j]="val";
                }
            }

            if(words[i]!="val"){
                System.out.println(words[i]+" "+count);
            }
        }
    }
}