package testNGAnnotations;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTestCase extends BaseTest {
	
	@Test(description = "Search for JAVA !!")
	public void search1()
	{
		driver.switchTo().activeElement().sendKeys("JAVA", Keys.ENTER);
	}
	
	@Test(description = "Search for SQL")
	public void search2()
	{
		driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
	}
	
	@Test(description = "Search for Selenium")
	public void search3()
	{
		driver.switchTo().activeElement().sendKeys("SELENIUM",Keys.ENTER);
	}
	

}
