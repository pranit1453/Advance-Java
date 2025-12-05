package com.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAspect {

	@Before("execution (* com.demo.service.*.*(..))")
	public void logBefore(JoinPoint jointPoint) {
		System.out.println("Calling : " + jointPoint.getSignature().getName());
	}

	@AfterReturning(pointcut = "execution (* com.demo.service.*.*(..))", returning = "result")
	public void logAfter(JoinPoint jointPoint, Object result) {
		System.out.println("Completed : " + jointPoint.getSignature().getName() + " with result : " + result);
	}

}
