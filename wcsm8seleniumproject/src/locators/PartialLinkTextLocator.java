package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PartialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	WebDriver	driver=new ChromeDriver(co);
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.get("file:///C:/Users/ADMIN/Desktop/WCSM8/LinkWebElement.html");
	
	driver.findElement(By.partialLinkText("Insta")).click();
		
		
	}

}
