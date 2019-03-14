package Question5;


import org.aspectj.lang.annotation.*;

@Aspect
public class AspectsClass {

    @Before("execution(void showDetails())")
    void beforeAdvice(){
        System.out.println("Before Advice is Running...");
    }

    @After("execution(void showDetails())")
    void afterAdvice(){
        System.out.println("After Advice is Running...");
    }

}
