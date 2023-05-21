package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelectorEdgeLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
	WebDriver	driver=new EdgeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("sarika",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("saei35467",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
