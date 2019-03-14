package Question3;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Database implements ApplicationEventPublisherAware {

    ApplicationEventPublisher applicationEventPublisher;

    void createDatabase(){
        System.out.println("Database Method...");
        MyEvent myEvent = new MyEvent(this);
        applicationEventPublisher.publishEvent(myEvent);
        MyEventListen eventListener = new MyEventListen();
        applicationEventPublisher.publishEvent(eventListener);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

}
