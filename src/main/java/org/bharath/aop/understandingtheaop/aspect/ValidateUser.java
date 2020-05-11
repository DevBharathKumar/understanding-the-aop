package org.bharath.aop.understandingtheaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class ValidateUser 
{
	
	private Logger logger = LoggerFactory.getLogger(ValidateUser.class);
	
	
	  @Before("org.bharath.aop.understandingtheaop.aspect.CommonPointCutConfig.businessPointCut()")
	  public void before(JoinPoint joinPoint) { 
		  logger.info("Validating the user ... "); 
		  logger.info("The user is allowed to access the method - {}",joinPoint); 
	  }
	 
}
