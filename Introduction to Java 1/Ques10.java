/*

Ques.10. Write a single program for following operation using overloading
  A) Adding 2 integer number
  B) Adding 2 double
  C) multiplying 2 float
  D) multiplying 2 int
  E) concate 2 string
  F) Concate 3 String

*/

public class Ques10 {

    void operation(int num1, int num2){
        System.out.println("Addition of Two Integers : "+(num1+num2));

    }
    void operation(double num1, double num2){
        System.out.println("Addition of Two Doubles : "+(num1+num2));

    }
    void operation(float num1, float num2){
        System.out.println("Multiplication of Two Floats : "+(num1*num2));

    }
    void multiply(float num1, float num2){
        System.out.println("Multiplication of Two Integers : "+(num1*num2));

    }
    void operation(String str1, String str2){
        System.out.println("Concatination of Two Strings : "+(str1+str2));

    }
    void operation(String str1, String str2, String str3){
        System.out.println("Concatination of Three Strings : "+(str1+str2+str3));

    }

    public static void main(String[] args) {

        Ques10 obj = new Ques10();

        obj.operation(10, 20);
        obj.operation(56.34, 89.34);
        obj.operation(34.98f, 23.44f);
        obj.multiply(54,82);
        obj.operation("Ankit ","TTN");
        obj.operation("Sumit ", "TTN ", "Noida");

    }
}
