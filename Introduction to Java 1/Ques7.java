/*

Ques.7 Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively.

*/

public class Ques7 {

    static int age = 21;

    static {
        String firstname = "Ankit";
        System.out.println("First Name : "+firstname);
    }

    static void getLastName(){
        String lastname = "Thakur";
        System.out.println("Last Name : "+lastname);
    }

    public static void main(String[] args) {
        getLastName();
        System.out.println("Age : "+age);

    }
}
