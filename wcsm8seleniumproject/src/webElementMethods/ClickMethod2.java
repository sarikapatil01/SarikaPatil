package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickMethod2 {

	public static void main(String[] args) {

		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.instagram.com/");
	driver.findElement(By.name("username")).sendKeys("Sarika");
	driver.findElement(By.name("password")).sendKeys("Sari@123");
	//using method chaning
	//driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	
	//using refference variable
	WebElement value = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	value.click();
	}

}
