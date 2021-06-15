package org.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PetsPojo1 extends BaseClassPets {
	
	public PetsPojo1() {
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(id="login2")
	private WebElement loginBtn;
	
	@FindBy(id="loginusername")
	private WebElement username;
	
	@FindBy(id = "loginpassword")
	private WebElement password;
	
	@FindBy(xpath = "//button [text() ='Log in']")
	private WebElement clickBtn;
	
	public WebElement iconClick() {
		return loginBtn;
	}

	public WebElement getUsrName() {
		return username;
	}
	public WebElement getUsrPassw() {
		return password;
	}
	public WebElement usrClick() {
		return clickBtn;
	}
}
	

