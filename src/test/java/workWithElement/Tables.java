package workWithElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tables {

	ChromeDriver driver;
	@BeforeTest
	public void openUrl() {

		String path=System.getProperty("user.dir")+"\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();

		//url to tables pages to first function
		driver.navigate().to("https://the-internet.herokuapp.com/tables");

	}
	@Test
	public void displayDataInTable() {
		
		WebElement table=driver.findElement(By.id("table1"));
		
		//get all rows
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		Assert.assertEquals(rows.size(), 5);
		for (WebElement row : rows) {
			List<WebElement> cols=row.findElements(By.tagName("td"));
			for (WebElement col : cols) {
				System.out.println(col.getText());
				
			}
			System.out.println();

			
		}
		
		
		
	}
	
	
	@AfterTest
	public void closeUrl() {
		driver.quit();
	}

}
