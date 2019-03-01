/*
 *
 * Ques.2 Create a functional interface whose method takes 2 integers and return one integer.
 *
 * */

interface MyFunctionalInterface{
    int add(int num1, int num2);
}

public class Ques2 {
    public static void main(String args[]) {

        MyFunctionalInterface myFunctionalInterface = (a,b) -> a+b;
        int result = myFunctionalInterface.add(33,55);
        System.out.println("Sum of two integers : "+result);
    }
}
