package org.bharath.aop.understandingtheaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfig {
	
	@Pointcut("execution(* org.bharath.aop.understandingtheaop.business.*.*(..))")
	public void businessPointCut() {}

}
