package com.google.seleniumMaven.test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FiefoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firefoxDriverPath =System.getProperty("user.dir")+"\\resources\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.google.com");
	}

}
