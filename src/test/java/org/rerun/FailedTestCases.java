package org.rerun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedTestCases implements IAnnotationTransformer {

	public void transform(ITestAnnotation b, Class c, Constructor d, Method m) {
		
		IRetryAnalyzer r = b.getRetryAnalyzer();	
			
			b.setRetryAnalyzer(RetryTestCases.class);			
		
		
		
	}

}
