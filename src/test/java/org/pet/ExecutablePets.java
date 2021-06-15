package org.pet;

import java.io.IOException;

public class ExecutablePets extends BaseClassPets {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		chromeBrowser();
		launchUrl("https://www.demoblaze.com/");
		maxWindow();
		
		PetsPojo1 p1 = new PetsPojo1();
		btnClick(p1.iconClick());
		pauseProgram();
		fillTextBox(p1.getUsrName(), readFromExcel(1,0));
		fillTextBox(p1.getUsrPassw(), readFromExcel(1,1));
		btnClick(p1.usrClick());
		
		BlazePojo2 p2 = new BlazePojo2();
		p2.monitorClick().click();
		p2.product1().click();
	}
	

}
