package Question5;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {


    public static void main(String args[]) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        context.start();
        Details details = context.getBean("details", Details.class);
        details.showDetails();

    }

}
