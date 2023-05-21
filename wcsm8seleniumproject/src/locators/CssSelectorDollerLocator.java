package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelectorDollerLocator {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	WebDriver	driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.instagram.com/");
	
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("sarika",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("saei35467",Keys.ENTER);
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("button[class$=' _acap _acas _aj1-']")).click();
	
	}

}
