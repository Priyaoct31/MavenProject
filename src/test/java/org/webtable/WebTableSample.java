package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableSample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\NEW\\PriyaMvn\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement tables = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement>  allRows = tables.findElements(By.tagName("tr"));
		
		for (WebElement allCells : allRows) {
			
			System.out.println(allCells.getText());
			List<WebElement> cellsData = allCells.findElements(By.tagName("td"));
			
			for (WebElement cellElement : cellsData) {
				System.out.println(cellElement.getText());
				
			}
			
		}
		
	}
}
