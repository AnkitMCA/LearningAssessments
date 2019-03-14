package Question3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {


    public static void main(String args[]) {

        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_config.xml");
        applicationContext.start();
        Database database = applicationContext.getBean("database", Database.class);
        database.createDatabase();
        applicationContext.stop();
    }

}
