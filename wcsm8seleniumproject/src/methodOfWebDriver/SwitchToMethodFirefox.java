package methodOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToMethodFirefox {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	
		WebDriver	driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("java", Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.switchTo().activeElement().sendKeys("mannual", Keys.ENTER);
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.quit();
		
	}

}
