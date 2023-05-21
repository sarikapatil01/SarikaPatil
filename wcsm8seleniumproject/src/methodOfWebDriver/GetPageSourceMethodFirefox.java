package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetPageSourceMethodFirefox {

	public static void main(String[] args) {
			
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	WebDriver	driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	
	String pageSource = driver.getPageSource();
	System.out.println(pageSource);
	}

}
