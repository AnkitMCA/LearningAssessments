package Question9;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[]) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        Tasks tasks = context.getBean("tasks", Tasks.class);
        tasks.method1("Ankit");
    }
}
