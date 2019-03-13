import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {

    public static void main(String args[]) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        // 1st Answer
        Database database =  context.getBean("database",Database.class);
        // 2nd Answer
        System.out.println("Database Name : "+database.getName());
        System.out.println("Database Port : "+database.getPort());

        // 3rd Answer
        Restaurant restaurant = context.getBean("teaRestaurant",Restaurant.class);
        HotDrink hotDrink = restaurant.getHotDrink();
        hotDrink.prepareHotDrink();

        // 4th Answer
        Restaurant restaurant1 = context.getBean("expressTeaRestaurant",Restaurant.class);
        HotDrink hotDrink1 = restaurant1.getHotDrink();
        hotDrink1.prepareHotDrink();

        // 5th Answer
        Complex complex = context.getBean("complexBean",Complex.class);
        System.out.println("\n\n........ List Items ........");
        complex.getList().forEach(System.out::println);
        System.out.println("........ Set Items ........");
        complex.getSet().forEach(System.out::println);
        System.out.println("........ Map Items ........");
        complex.getMap().entrySet().forEach(System.out::println);

        // 6th Answer & 9th Answer
        Restaurant r2 = context.getBean("teaRestaurant2",Restaurant.class);
        r2.getHotDrink().prepareHotDrink();

        Restaurant r3 = context.getBean("teaRestaurant3",Restaurant.class);
        r3.getHotDrink().prepareHotDrink();

        Restaurant r4 = context.getBean("teaRestaurant4",Restaurant.class);
        r4.getHotDrink().prepareHotDrink();

        // 7th Answer
        System.out.println("\nteaRestaurant has prototype scope : " + context.isPrototype("teaRestaurant1"));

        // 8th Answer
        // Apply @Required in getter method of Restaurant class.

    }
}
