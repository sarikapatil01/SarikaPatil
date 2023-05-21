package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearMethod2 {

	public static void main(String[] args) {

		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	WebDriver	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.instagram.com/");
	 WebElement value = driver.findElement(By.name("username"));
	 value.sendKeys("Sarika");
	 
	
	WebElement value2 = driver.findElement(By.name("password"));
	value2.sendKeys("sari@12");
	
	value.clear();
	value2.clear();
	

		
	}

}
