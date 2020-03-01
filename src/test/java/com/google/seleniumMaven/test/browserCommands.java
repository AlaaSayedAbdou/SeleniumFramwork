package com.google.seleniumMaven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class browserCommands {
	ChromeDriver driver;
	@BeforeTest
	public void openUrl() {
		
		String path=System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
				
		//url to tables pages
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		System.out.println(driver.getCurrentUrl());

		

	}

	@Test
	public void commands() {
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
		
		
	}
	@AfterTest
	public void Quit() {
		driver.quit();
	}

}
