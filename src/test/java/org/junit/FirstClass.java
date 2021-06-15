package org.junit;

import java.io.IOException;
import java.util.Date;
import org.One.BaseClass;
import org.openqa.selenium.By;

public class FirstClass extends BaseClass {
	
	@BeforeClass
	public static void testCase2 () {
		chromeBrowser();
		launchUrl("https://adactinhotelapp.com/");
		maxWindow();
		}

	@Test
	public void testCase3() throws IOException {
		fillTextBox(driver.findElement(By.id("username")), readFromExcel(1,0));
		fillTextBox(driver.findElement(By.id("password")), readFromExcel(1,1));				
		btnClick(driver.findElement(By.id("login")));
	}
	@Test
	public void testCase6() throws InterruptedException {
		pauseProgram();
	}
	
	@AfterClass
	public static void testCase5() {
		closeBrowser();
	}
	
	@Before
	public void testCase1() {
		pageUrl();
		pageTitle();		
	}
	
	@After
	public void testCase4() {
		Date d = new Date();
		System.out.println(d);		
	}	
}
