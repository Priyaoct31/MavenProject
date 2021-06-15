package org.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazePojo2 extends BaseClassPets {
	
	public BlazePojo2() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Monitors']")
	private WebElement monitor;

	@FindBy(xpath="//a[text()='Apple monitor 24']")
	private WebElement product1;
	
	public WebElement monitorClick() {
		return monitor;
	}
	
	public WebElement  product1() {
		return product1;

	}
}
