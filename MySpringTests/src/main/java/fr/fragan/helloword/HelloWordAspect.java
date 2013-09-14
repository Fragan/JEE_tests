package fr.fragan.helloword;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class HelloWordAspect {

	// Execute avant l'execution printHello(..)
	@Before("execution(* fr.fragan.helloword.HelloWorld.printHello(..))")
	public void logBefore(JoinPoint joinPoint) {
		
		System.out.println("@Before : " + joinPoint.getKind());
	}
	
	// Execute apres l'execution printHello(..)
	@After("execution(* fr.fragan.helloword.HelloWorld.printHello(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("@After : " + joinPoint.getKind());
	}
	
	// Execute XXXXX l'execution printHello(..)
	@Around("execution(* fr.fragan.helloword.HelloWorld.printHello(..))")
	public void logAround(JoinPoint joinPoint) {

		System.out.println("@Around : " + joinPoint.getKind());
	}
}
