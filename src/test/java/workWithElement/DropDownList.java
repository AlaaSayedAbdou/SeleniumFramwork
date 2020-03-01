package workWithElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownList {
	
	/////select function 
	
	ChromeDriver driver;
	@BeforeTest
	public void openUrl() {
		
		String path=System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
				
		//url to tables pages to first function
		driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
		
	}
	@Test
	public void SelectFromDropDownList() {
		
		WebElement List=driver.findElement(By.id("dropdown"));
		Select options=new Select(List);
		Assert.assertFalse(options.isMultiple());
		Assert.assertEquals(3,options.getOptions().size());
		//options.selectByValue("1");
		//or
		//options.selectByIndex(1);
		//or
		options.selectByVisibleText("Option 1");
		Assert.assertEquals("Option 1",options.getFirstSelectedOption().getText());

		
	}
	
	
	
	@AfterTest
	public void closeUrl() {
		driver.quit();
	}
}
