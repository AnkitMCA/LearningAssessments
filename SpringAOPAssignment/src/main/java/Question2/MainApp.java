package Question2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String args[]) {

        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring_config.xml");
        ctx.start();
        Dummy dummy = ctx.getBean("dummy",Dummy.class);
        dummy.display();
    }
}
