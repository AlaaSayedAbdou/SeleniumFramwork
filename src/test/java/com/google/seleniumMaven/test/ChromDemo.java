package com.google.seleniumMaven.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromDemo {

	public static void main(String[] args) {
	
		//path of chrome driver in resources file
		String chromeDriverPath=System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
		
		//open in chrome browser
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");

		
	}

}
