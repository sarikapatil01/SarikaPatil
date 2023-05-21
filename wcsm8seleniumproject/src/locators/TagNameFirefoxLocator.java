package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TagNameFirefoxLocator {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	WebDriver	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("sarika",Keys.ENTER);
	Thread.sleep(2000);
	
	
		
	}

}
