package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleMethodFirefox {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		WebDriver	driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
		
		Thread.sleep(2000);
		

	}

}
