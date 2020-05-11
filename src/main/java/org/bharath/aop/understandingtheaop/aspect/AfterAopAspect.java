package org.bharath.aop.understandingtheaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect 
{
	private Logger logger = LoggerFactory.getLogger(AfterAopAspect.class);
	
	@After("org.bharath.aop.understandingtheaop.aspect.CommonPointCutConfig.businessPointCut()")
	public void after(JoinPoint joinPoint) {
		logger.info("* Inside After advice - {} *",joinPoint);
	}
	
	@AfterReturning(value="org.bharath.aop.understandingtheaop.aspect.CommonPointCutConfig.dataPointCutUsingWithin()",
			returning = "result")
	public void afterReturn(JoinPoint joinPoint, Object result) {
		logger.info("# Inside After returning advice - {} with return - {} #",joinPoint,result);
	}
	
	@AfterThrowing(value="org.bharath.aop.understandingtheaop.aspect.CommonPointCutConfig.businessPointCut()",
			throwing = "exception")
	public void afterException(JoinPoint joinPoint,Exception exception) {
		logger.info("# Inside After throwing advice - {} with exception - {} #",joinPoint,exception.getMessage());
	}
}
