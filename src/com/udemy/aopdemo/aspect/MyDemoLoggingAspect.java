package com.udemy.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	// this is where we add all of our related  advices for logging
	
	// let's start with @Before advice
	
	//@Before("execution(public void add*())")
	//@Before("execution(public void updateAccount())")
	//@Before("execution(* add*(..))") // match on ANY parameters
	@Before("execution(* com.udemy.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice()
	{
		System.out.println("\n===> Executiong @Before advice on method ");
	}
	
	

}
