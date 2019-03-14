package Question3;

import org.springframework.context.ApplicationListener;

public class MyEventListen implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println(event.getSource());
    }
}
