package com.google.seleniumMaven.test;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExploraleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String internetExplorerPath =System.getProperty("user.dir")+"\\resources\\IEDriverServer.exe";

		System.setProperty("webdriver.ie.driver",internetExplorerPath);
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.navigate().to("http://www.visualstudio.com");

	}

}
