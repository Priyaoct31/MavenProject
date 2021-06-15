package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {
	
	@Test
	private void tc1() {
		System.out.println("Test 1");

	}
	
	@Test
	private void tc2() {
		System.out.println("Test 2");
		Assert.assertTrue(false);

	}
	
	@Test
	private void tc3() {
		System.out.println("Test 3");
		Assert.assertTrue(false);

	}
	
	@Test
	private void tc4() {
		System.out.println("Test 4");

	}
	

}
