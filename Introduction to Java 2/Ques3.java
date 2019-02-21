/*

Ques.3 WAP to produce NoClassDefFoundError and ClassNotFoundException exception.

*/

public class Ques3 {

    public static void main(String[] args) {

        //Delete Data.class after compilation to get NoClassDefFoundError.

        Data data = new Data();
        data.setId(10);
        System.out.println("Data Id = "+data.getId());

        try
        {
            Class.forName("abc");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
