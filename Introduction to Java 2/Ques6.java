/*

Ques.6 WAP showing try, multi-catch and finally blocks.

*/

public class Ques6 {

    int divideByZero(int a){
        return a/0;
    }

    public static void main(String[] args) {
        Ques6 ques6 = new Ques6();
        try {
            ques6.divideByZero(10);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("First Catch Block Executed");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Second Catch Block Executed");
        } finally {
            System.out.println("Finally Block Executed");
        }
    }
}
