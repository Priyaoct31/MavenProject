package org.integration;

import java.io.IOException;

import org.One.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AllIntegration extends BaseClass {
	
		@Test
		public static void testCase1() {
			chromeBrowser();
			launchUrl("https://adactinhotelapp.com/");
			maxWindow();

		}
		@Test(dataProvider = "PriyaData")
		public void testCase2(String user, String passw) throws IOException {
			WebElement txtUser = driver.findElement(By.id("username"));
			fillTextBox(txtUser, user);
			WebElement txtPassword = driver.findElement(By.id("password"));
			fillTextBox(txtPassword, passw);				
			btnClick(driver.findElement(By.id("login")));

		}
		@DataProvider(name="PriyaData")
		private Object[][] data() {
			return new Object[][] {
				
				{"Priya3110", "Priya@3110"},
				{"Greens", "Greens@143"}
				
			};

		}
		
		
		
		
		
	}


