package workWithElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoubleClick {

	ChromeDriver driver;
	@BeforeTest
	public void openUrl() {

		String path=System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();

		driver.navigate().to("http://cookbook.seleniumacademy.com/DoubleClickDemo.html");

	}
	@Test
	public void doubleClickToChangeColor() {
		WebElement message=driver.findElement(By.id("message"));
		
		System.out.println(message.getCssValue("background-color"));
		///assert that color is blue in the first
	//	Assert.assertEquals(message.getCssValue("background"), "rgb(0, 0, 255)");

		//that is advanced user interaction Api to this action
		//we use actions class build in class
		Actions builder=new Actions(driver);
		builder.doubleClick(message).perform();
		
		///assert that color is yellow in the first
		System.out.println(message.getCssValue("background-color"));
	//	Assert.assertEquals(message.getCssValue("background"), "rgb(255, 255, 0)");
		
		

	}
	@AfterTest
	public void closeUrl() {
		driver.quit();
	}
}
