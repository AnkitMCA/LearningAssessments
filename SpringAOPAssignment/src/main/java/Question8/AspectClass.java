package Question8;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectClass {

    @Pointcut("execution(void method1())")
    void method1PointCut(){}

    @After("method1PointCut()")
    void after(){
        System.out.println("After Pointcut ");
    }

}
