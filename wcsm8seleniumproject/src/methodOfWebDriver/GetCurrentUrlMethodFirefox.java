package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCurrentUrlMethodFirefox {

	public static void main(String[] args) {

		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		WebDriver	driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
	
		
		
	}

}
