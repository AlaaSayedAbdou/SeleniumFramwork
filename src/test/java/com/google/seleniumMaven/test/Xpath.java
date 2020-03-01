package com.google.seleniumMaven.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Xpath {
	ChromeDriver driver;
	@BeforeTest
	public void openUrl() {
		
		String path=System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
				
		//url to tables pages
		driver.navigate().to("https://the-internet.herokuapp.com/login");

	}
	@Test
	public void ApsoluteXpath() {
		WebElement name=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		System.out.println(name.getTagName());
	}
	
	@Test
	public void RelativeXpath() {
		WebElement name=driver.findElement(By.xpath("//input"));
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement button=driver.findElement(By.xpath("//button"));
		System.out.println(name.getTagName());
		System.out.println(pass.getTagName());
		System.out.println(button.getTagName());

		
	}
	
	@AfterTest
	public void Quit() {
		driver.quit();
	}

}
