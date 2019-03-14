package Question6;

import java.io.IOException;

public class AllMethods {

    void method1() throws IOException {
        System.out.println("Method 1 with IOException");
        throw new IOException("IOException");
    }

    void method2() {
        System.out.println("Method 2 without IOException");
    }

    void method3() throws IOException {
        System.out.println("Method 3 with IOException ");

        throw new IOException("IOException");
    }

}
