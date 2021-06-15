package org.testngpractice;

import org.One.BaseClass;
import org.hotel.LoginPojo;
import org.hotel.Pojo1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExecuteTestNG extends BaseClass{
	
	@BeforeClass
	private void firstTC() {
		chromeBrowser();
		launchUrl("https://adactinhotelapp.com/");
		maxWindow();

	}
//	@AfterClass
//	private void lastTC() {
//		closeBrowser();
//
//	}
	
	@Test
	private void loginPage() {
		LoginPojo lp = new LoginPojo();
		fillTextBox(lp.getUsrName(), "Priya3110");
		fillTextBox(lp.getUsrPassw(), "Priya@3110");
		btnClick(lp.getLoginBtn());
	}
	
	@Test
	private void searchHotelPage() {
		Pojo1 p1 = new Pojo1();
		dropdownValues(p1.getUsrLocation(), 7);

	}
	
	

}
