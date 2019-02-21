/*

Ques.13 Create a custom exception that do not have any stack trace.

*/

class CustomException extends Exception {
    String message;

    CustomException(String message) {
        super(message);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}

public class Ques13 {

    public static void main(String[] args) {
        try {
            throw new CustomException("Custom Exception Example");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.fillInStackTrace());
            ex.printStackTrace();
        } finally {
            System.out.println("CustomException handled");
        }
    }
}