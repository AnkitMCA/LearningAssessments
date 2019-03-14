package Question7;

import Question4.Services;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String args[]) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        ServicesMethod services = context.getBean("services7", ServicesMethod.class);
        services.serviceFirst();
        services.serviceSecond();
        services.serviceThird();
        services.serviceFourth();
    }
}
