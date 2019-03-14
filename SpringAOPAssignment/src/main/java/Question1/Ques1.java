package Question1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ques1 {

    public static void main(String args[]) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        context.start();
        context.stop();
        context.close();
    }
}
