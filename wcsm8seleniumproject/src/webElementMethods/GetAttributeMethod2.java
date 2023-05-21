package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeMethod2 {
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/");
	
	WebElement value = driver.findElement(By.name("email"));
	 String valueName = value.getAttribute("type");
	 System.out.println(valueName);
	 
	}

}
