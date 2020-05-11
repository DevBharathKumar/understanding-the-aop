package org.bharath.aop.understandingtheaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfig {
	
	@Pointcut("execution(* org.bharath.aop.understandingtheaop.business.*.*(..))")
	public void businessPointCut() {}
	
	@Pointcut("within(org.bharath.aop.understandingtheaop.dao.*)")
	public void dataPointCutUsingWithin() {}
	
	@Pointcut("bean(*business*)")
	public void beanPointCut() {}
}
