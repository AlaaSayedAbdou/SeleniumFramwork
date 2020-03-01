package workWithElement;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckBox {
	ChromeDriver driver;
	@BeforeTest
	public void openUrl() {

		String path=System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();

		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");

	}
	@Test(enabled = false)
	public void WorkWithChechList() {

		WebElement box1=driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]"));
		if(!box1.isSelected()) {
			box1.click();
		}
		WebElement box2=driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[2]"));
		if(box2.isSelected()) {
			box2.click();
		}
	}
	////this function to make sure that element is found and to less error found
	private boolean IsElementPreasent(By by) {
		try
		{
			driver.findElement(by);
			return true;
		}catch(NoSuchElementException e) {
			return false;
		}
		
	}
	
	@Test 
	public void checkboxWithIsElementPreasent() {
		
		if(IsElementPreasent(By.xpath("/html/body/div[2]/div/div/form/input[1]")))
		{
			WebElement box1=driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]"));

			
			if(!box1.isSelected() && box1.isEnabled() && box1.isDisplayed()) {
				box1.click();
			}
			
		}else {
			Assert.fail("the element not found");
		}
		
	}
	@AfterTest
	public void closeUrl() {
		driver.quit();
	}

}
