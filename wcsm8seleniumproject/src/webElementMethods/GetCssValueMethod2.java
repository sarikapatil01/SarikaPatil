package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCssValueMethod2 {

	public static void main(String[] args)  {

		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodrivers.exe");
	WebDriver	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/");
	WebElement buttonV = driver.findElement(By.xpath("//button[@name='login']"));
	String value = buttonV.getCssValue("color");
	System.out.println(value);
	
	WebElement linkV = driver.findElement(By.id("u_0_0_lA"));

	String value2 = linkV.getCssValue("color");
	System.out.println(value2);
	
	
	}

}
