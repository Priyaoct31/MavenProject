package org.Two;
import java.io.IOException;
import org.One.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecutableClass extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		chromeBrowser();
		launchUrl("http://adactinhotelapp.com/");
		maxWindow();		
		WebElement userName = driver.findElement(By.id("username"));
		fillTextBox(userName, readFromExcel(1,0));		
		WebElement passw = driver.findElement(By.id("password"));
		fillTextBox(passw, readFromExcel(1,1));		
		pictures("Pic1");		
		WebElement buttonClk = driver.findElement(By.id("login"));
		btnClick(buttonClk);
		WebElement usrLocation = driver.findElement(By.id("location"));
		dropdownValues(usrLocation, 3);
		WebElement usrHotel = driver.findElement(By.id("hotels"));
		dropdownValues(usrHotel, 3);
		WebElement roomType = driver.findElement(By.id("room_type"));
		dropdownValues(roomType, 3);
		WebElement roomCount = driver.findElement(By.id("room_nos"));
		dropdownValues(roomCount, 3);
		WebElement chkInDate = driver.findElement(By.id("datepick_in"));
		fillTextBox(chkInDate, readFromExcel(1,2));
		WebElement chkOutDate = driver.findElement(By.id("datepick_out"));
		fillTextBox(chkOutDate, readFromExcel(1,3));
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		dropdownValues(adultRoom, 2);
		WebElement childRoom = driver.findElement(By.id("child_room"));
		dropdownValues(childRoom, 2);
		WebElement srchBtn = driver.findElement(By.id("Submit"));
		btnClick(srchBtn);
		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		btnClick(radioBtn);
		WebElement searchButton = driver.findElement(By.id("continue"));
		btnClick(searchButton);
		WebElement firstName = driver.findElement(By.id("first_name"));
		fillTextBox(firstName, readFromExcel(1,4));
		WebElement lastName = driver.findElement(By.id("last_name"));
		fillTextBox(lastName, readFromExcel(1,5));
		WebElement usrAddress = driver.findElement(By.id("address"));
		fillTextBox(usrAddress, readFromExcel(1,6));
		WebElement ccNumb = driver.findElement(By.id("cc_num"));
		fillTextBox(ccNumb, readFromExcel(1,7));
		WebElement cardType = driver.findElement(By.id("cc_type"));
		dropdownValues(cardType, 2);
		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		dropdownValues(expMonth, 2);
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		dropdownValues(expYear, 12);
		WebElement cvvNumber = driver.findElement(By.id("cc_cvv"));
		fillTextBox(cvvNumber, readFromExcel(1,8));
		WebElement bookNowBtn = driver.findElement(By.id("book_now"));
		btnClick(bookNowBtn);
		pauseProgram();
		WebElement ordNumber = driver.findElement(By.xpath("//input[@id='order_no']"));
		orderNumber(ordNumber);		
		writeInExcel(1, 9, s5, ordNumber);	
		
		
		
	}
}
