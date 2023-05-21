package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.netflix.com/in/login");
	
	WebElement username = driver.findElement(By.name("userLoginId"));
	
	WebElement password = driver.findElement(By.name("password"));
	
	WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	
	username.sendKeys("Sarika");
	password.sendKeys("Sari12345");
	button.submit();
	
	}

}
