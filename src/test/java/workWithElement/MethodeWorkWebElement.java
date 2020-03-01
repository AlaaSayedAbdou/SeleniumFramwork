package workWithElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MethodeWorkWebElement {
	
	ChromeDriver driver;
	@BeforeTest
	public void openUrl() {
		
		String path=System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
				
		//url to tables pages to first function
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		
		//url to tables pages to second function
		//driver.navigate().to("https://www.google.com");

	}
	@Test(enabled = false)
	public void methodsWorkWithElement() {
		
		WebElement name=driver.findElement(By.id("username"));
		WebElement pass=driver.findElement(By.id("password"));
		WebElement button=driver.findElement(By.className("radius"));
		
		name.clear();
		name.sendKeys("tomsmith");
		pass.clear();
		pass.sendKeys("SuperSecretPassword!");
		button.click();
		
		WebElement successMessage=driver.findElement(By.id("flash-messages"));
		
		Assert.assertTrue(successMessage.getText().contains("You logged into"));
		}
	
	@Test(enabled = false)
	public void submitMethod() {
		
		WebElement googleText=driver.findElement(By.name("q"));
		googleText.clear();
		googleText.sendKeys("selenium");
		googleText.submit();
		WebElement googleSecondText=driver.findElement(By.name("q"));
		googleSecondText.clear();
		googleSecondText.sendKeys("automation");
		googleSecondText.submit();
		
		
	}
	@AfterTest
	public void closeUrl() {
		driver.quit();
	}

}
