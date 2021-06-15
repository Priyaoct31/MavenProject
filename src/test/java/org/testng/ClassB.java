package org.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ClassB {
	
	@Ignore
	@Test
	private void tc22() {
		System.out.println("tc 22 executed");
	}
	

}
