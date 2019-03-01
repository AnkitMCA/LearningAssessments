/*
 *
 * Ques.1 Write the following a functional interface and implement it using lambda:
(1) First number is greater than second number or not    ==>>    Parameter (int ,int ) Return boolean
(2) Increment the number by 1 and return incremented value   ==>>   Parameter (int) Return int
(3) Concatination of 2 string     ==>>    Parameter (String , String ) Return (String)
(4) Convert a string to uppercase and return.  ==>>   Parameter (String) Return (String)
 *
 * */

interface Greater {
    boolean isGreater(int a, int b);
}

interface Increment {
    int incrementValue(int a, int b);
}

interface ConcatString{
    String concString(String s1, String s2);
}

interface ToUpper{
    String convertTo(String s1);
}

public class Ques1 {
    public static void main(String args[]) {
        Greater greater = (int a, int b) -> {
            if (a > b) {
                return true;
            }
            return false;
        };
        boolean result = greater.isGreater(34, 4);
        System.out.println(result);

        Increment increment =(a,b)-> a+1;
        System.out.println(increment.incrementValue(3,4));

        ConcatString concatString = (s1,s2)-> s1+s2;
        System.out.println(concatString.concString("Abcde","Fghij"));

        ToUpper toUpper = s1 -> s1.toUpperCase();
        System.out.println(toUpper.convertTo("Abcde Fghij"));

    }
}
