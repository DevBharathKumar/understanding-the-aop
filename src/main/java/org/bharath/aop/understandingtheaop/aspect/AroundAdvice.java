package org.bharath.aop.understandingtheaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAdvice {

	private Logger logger = LoggerFactory.getLogger(AroundAdvice.class);
	
	@Around("execution(* org.bharath.aop.understandingtheaop.business.*.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable
	{
		logger.info("$ STARTING AROUND {} ",joinPoint);
		long startTime = System.currentTimeMillis();
		
		Object obj = joinPoint.proceed();
		
		long endTime = System.currentTimeMillis() - startTime;
		logger.info("The {} took {} to execute",joinPoint,endTime); 
		logger.info("$ ENDING AROUND {} ",joinPoint);
		
		return obj;
	}
	
}
