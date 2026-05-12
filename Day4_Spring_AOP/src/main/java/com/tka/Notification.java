package com.tka;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class Notification {

//	@Before("execution ( public void deposite())")
//	public void beforeMain() {
//		System.err.println("Welcome to ATM ... ! ");
//	}
//
//	@After("execution ( public void deposite())")
//	public void afterMain() {
//		System.err.println("Transaction Completed ... ! ");
//	}

	@Around("execution (* com.tka.Bank.*(..))")
	public void beforeAfterMain(ProceedingJoinPoint p) {
		System.out.println("Welcome to ATM ... ! ");

		try {
			p.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Transaction Completed ... ! ");
	}

}
