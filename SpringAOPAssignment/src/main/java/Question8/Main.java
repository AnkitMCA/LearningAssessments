package Question8;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[]) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        Methods methods = context.getBean("methods",Methods.class);
        methods.method1();
        methods.method2();

    }
}
