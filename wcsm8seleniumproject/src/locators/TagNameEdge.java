package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TagNameEdge {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		
		
	WebDriver	driver=new EdgeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("sarika",Keys.ENTER);
	Thread.sleep(2000);
	
	}

}
