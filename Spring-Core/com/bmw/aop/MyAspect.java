package com.bmw.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	@Before(value = "execution(public String getName())")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint+"Aspectj common logging method");
	}
	@Before(value = "execution(public String com.bmw.aop.Department.getName())")
	public void loggingAdvice1() {
		System.out.println("Aspectj Department logging method");
	}
	@Before(value = "execution(public * get*())")
	public void loggingAdvice2() {
		System.out.println("Aspectj WildCard method");
	}
	@Before(value = "execution(* get*())")
	public void loggingAdvice3() {
		System.out.println("Aspectj WildCard method for all access modifiers");
	}
	@Before(value = "execution(* get*(*))")
	public void loggingAdvice4() {
		System.out.println("Aspectj WildCard method for all access modifiers with one argument");
	}
	@Before("pointCutMethod()")
	public void loggingAdvice5() {
		System.out.println("Aspectj WildCard method for all access modifiers with any argument and using pointcut");
	}
	@Before("pointCutMethod() && pointcutAllDepartment()")
	public void loggingAdvice6() {
		System.out.println("Pointcut combination");		
	}
	@Before("args(String)")
	public void loggingAdvice7() {
		System.out.println("Method that takes String argument advice");		
	}
	@Before("args(String name)") 
	public void loggingAdvice8(String name) {
		System.out.println("Method that takes String argument advice"+name);		
	}
	@After(value = "execution(public String com.bmw.aop.Department.getName())")
	public void loggingAdvice9() {
		System.out.println("Aspectj Department logging method");
	}
	@AfterReturning(pointcut = "execution(public String com.bmw.aop.Department.getName())",returning = "returnVal")
	public void loggingAdvice10(Object returnVal) {
		System.out.println("Aspectj Department logging method"+returnVal);
	}
	@AfterThrowing(pointcut = "execution(public String com.bmw.aop.Department.getName())",throwing = "ex")
	public void loggingAdvice11(Exception ex) {
		System.out.println("An exception has been thrown");
		System.out.println(ex);
	}
	@Before("@annotation(com.bmw.aop.CustomAspectAnnotation)") 
	public void loggingAdvice12(String name) {
		System.out.println("Method that takes String argument advice"+name);		
	}
	
	@Around("allGetters()")
	public Object loggingAdvice12(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Before target code execution");
		Object object=joinPoint.proceed();
		System.out.println("After target code execution");
		return object;
	}
	@Pointcut("execution(* get*())")
	public void pointCutMethod() {}
	@Pointcut("within(com.bmw.aop.Department)")
	public void pointcutAllDepartment() {}
	@Pointcut("within(com.bmw.aop.*)")
	public void pointcutAllClassesInsideAopPackage() {}
	@Pointcut("within(com.bmw.aop..*)")
	public void pointcutAllClassesInsideAopPackageAndSubPackage() {}
	
	
}
