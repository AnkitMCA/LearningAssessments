package Question6;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainClass {

    public static void main(String args[]) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        AllMethods methods = context.getBean("allMethods",AllMethods.class);
        try {
            methods.method1();
        } catch (IOException e) {
        }
        methods.method2();
        try {
            methods.method3();
        } catch (IOException e) {
        }
    }
}
