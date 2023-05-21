package methodOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FindElementsMethodFirefox {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		WebDriver	driver=new FirefoxDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.google.com");
		
		driver.switchTo().activeElement().sendKeys("laptop");
		Thread.sleep(2000);
		List<WebElement> laptopOptions = driver.findElements(By.xpath("//div[@class='gLFyf i4ySpb']"));
		
		
		//by using for loop
		
		/*for(int i=0; i<laptopOptions.size(); i++ )
		{
			String laptop = laptopOptions.get(i).getText();
			System.out.println(laptop);
		}*/
		
		//by using for each loop
		
		for(WebElement laptop:laptopOptions)
		{
			System.out.println(laptop.getText());
			
		}
	
		

	}

}
