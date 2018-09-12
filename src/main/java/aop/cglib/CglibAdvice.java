package aop.cglib;

import aop.MonitorSession;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CglibAdvice {
    @Pointcut("execution (* aop.cglib.interfac.*.*(..))")
    public void pointcut(){
    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        MonitorSession.begin(joinPoint.getSignature().getName());
        joinPoint.proceed();
        MonitorSession.end();
    }
}
