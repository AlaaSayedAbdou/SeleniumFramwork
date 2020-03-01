package com.google.seleniumMaven.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindingElementsByTagname {
	ChromeDriver driver;
	@BeforeTest
	private void openUrl() {
		
		String path=System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
				
		//url to tables pages
		driver.navigate().to("https://the-internet.herokuapp.com/tables");

	}
	@Test
	private void GetElements() {
		
		WebElement table= driver.findElement(By.id("table1"));
		List <WebElement> data=table.findElements(By.tagName("tr"));
		System.out.println(data.size());
		System.out.println(data.get(3).getText());

		
		
	}
	
	@AfterTest
	private void Quit() {
		driver.quit();
	}
	

}
