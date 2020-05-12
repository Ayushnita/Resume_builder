package com.openuniquesolutions.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAOP {
	
	private final Logger log;
	
	public LoggingAOP() {
		log  = LoggerFactory.getLogger(LoggingAOP.class);
	}
	
	@Around("within (com.openuniquesolutions.controller..*)")
	public void loggingAround(ProceedingJoinPoint joinPoint) throws Throwable {
		String methodCall = joinPoint.getSignature().getName();
		log.info("Metod Call : " + methodCall);
		joinPoint.proceed();
		log.info("Method Complete : "+ methodCall);
	}
	
	@AfterReturning(pointcut = "within (com.openuniquesolutions.service..*)",
					returning = "returnValue")
	public void loggingOnServiceLeavel(JoinPoint joinPoint, Object returnValue) {
		log.info("Return Value :  " + returnValue.toString());
	}

}
