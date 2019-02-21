/*

Ques.4 WAP to create singleton class.

*/

public class Ques4 {

    private static Ques4 obj;

    private Ques4(){

    }

    public static Ques4 getInstance(){
        if(obj == null){
            obj = new Ques4();
        }
        return obj;
    }

    public void checkfunction(){
        System.out.println("This Object is working");
    }

    public static void main(String a[]){
        Ques4 ques4 = Ques4.getInstance();
        ques4.checkfunction();

    }
}