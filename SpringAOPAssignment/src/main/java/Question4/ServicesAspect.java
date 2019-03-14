package Question4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ServicesAspect {

    @Before("within(Question4.*)")
    void beforeAdvice(){
        System.out.println("Before Advice is Running");
    }

}
