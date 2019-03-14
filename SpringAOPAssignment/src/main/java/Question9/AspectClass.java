package Question9;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectClass {

    @Before("execution(void method1(String))")
    void before(JoinPoint joinPoint) {
        System.out.println("Before Aspect Completed");
        System.out.println(joinPoint.getSignature());
        for (Object obj : joinPoint.getArgs()) {
            System.out.println(obj);
        }
    }

}
