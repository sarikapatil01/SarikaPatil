package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.netflix.com/in/login");
	
	WebElement username = driver.findElement(By.name("userLoginId"));
	
	WebElement password = driver.findElement(By.name("password"));
	
	WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	
	if(username.isDisplayed())
	{
		username.sendKeys("Sarika*");
	}
	else {
		System.out.println("We will get Exception");
	}
	if(password.isDisplayed())
	{
		password.sendKeys("Sari@123");
	}
	else {
		System.out.println("We will get Exception");
		
	}
	if(button.isDisplayed())
	{
		button.submit();
	}
	else {
		System.out.println("We will get Exception");
	}
	}

}
