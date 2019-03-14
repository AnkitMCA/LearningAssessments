package Question4;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String args[]) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        Services services = (Services) context.getBean("services",Services.class);
        services.firstService();
        services.secondService();
        services.thirdService();
        services.fourthService();
    }
}
