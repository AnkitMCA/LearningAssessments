package Question7;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ServicesAspect {

    @Before("execution(void service*())")
    void before(JoinPoint joinPoint){
        System.out.println("Before "+ joinPoint.getSignature());
    }

    @After("execution(void service*()))")
    void after(JoinPoint joinPoint){
        System.out.println("After "+ joinPoint.getSignature());
    }

//    @Before("within(Question7.*)")
//    void before(JoinPoint joinPoint){
//        System.out.println("Before "+ joinPoint.getSignature());
//    }
//    @After("within(Question7.*)")
//    void after(JoinPoint joinPoint){
//        System.out.println("After "+ joinPoint.getSignature());
//    }
//
//    @Before("args()")
//    void before(JoinPoint joinPoint){
//        System.out.println("Before "+ joinPoint.getSignature());
//    }
//
//    @After("args()")
//    void after(JoinPoint joinPoint){
//        System.out.println("After "+ joinPoint.getSignature());
//    }
//
//    @Before("this(Question7.ServicesMethod)")
//    void before(JoinPoint joinPoint){
//        System.out.println("Before "+ joinPoint.getSignature());
//    }
//
//    @After("this(Question7.ServicesMethod)")
//    void after(JoinPoint joinPoint){
//        System.out.println("After "+ joinPoint.getSignature());
//    }
//
//    @Before("bean(services7)")
//    void before(JoinPoint joinPoint){
//        System.out.println("Before "+ joinPoint.getSignature());
//    }
//
//    @After("bean(services7)")
//    void after(JoinPoint joinPoint){
//        System.out.println("After "+ joinPoint.getSignature());
//    }

}
