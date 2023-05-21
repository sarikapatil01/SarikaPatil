package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateMethodFirefox {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	WebDriver	driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
	driver.quit();
	}

}
