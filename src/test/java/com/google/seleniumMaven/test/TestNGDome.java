package com.google.seleniumMaven.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.fail;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TestNGDome {


	ChromeDriver driver;
	
	@BeforeTest
	public void OpenURL() {
		String ChromePath=System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",ChromePath);
		driver=new ChromeDriver();
		driver.navigate().to("https:\\www.google.com");
	}
	
	//priority parameter to tell what open before what
	//depend on parameter to prevent this method(skip) if first method fail
	
	@Test(priority = 2, dependsOnMethods = {"getURL"})
	public void getTitle() {
		System.out.println(driver.getTitle());
		
	}
	
	
	//assert 
	@Test()
	public void getTitleWithAssert() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
		System.out.println("Assert is true ");
		
		
	}
	
	@Test(priority = 1,alwaysRun = true)
	public void getURL() {
		System.out.println(driver.getCurrentUrl());
		//fail("Throw exciption");
		
	}
	@Test(enabled = false)
	public void kl() {
		System.out.println("Hello gys");
			
	}
	
	//function to show group parameter 
	/*put it in xml file to run
	 * 
	 *  <groups>
 <run>
 
 <include name="group">
  </include>
 
 </run>     
  
  </groups>*/
	@Test(groups = {"group"})
	public void fGroup() {
		System.out.println("hi group one");
			
	}
	@Test(groups = {"group"})
	public void sGroup() {
		System.out.println("hi group two");
			
	}

	@AfterTest
	public void getUrl() {
		driver.quit();
	}

}
