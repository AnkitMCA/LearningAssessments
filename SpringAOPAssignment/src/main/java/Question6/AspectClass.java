package Question6;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import java.io.IOException;

@Aspect
public class AspectClass {

    @AfterThrowing(pointcut = "execution(* *(..))" ,throwing = "ioException")
    public void logAfterThrowing(IOException ioException)
    {
        System.out.println("Aspect After Throwing " +ioException);
    }

}
