package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("http://desktop-3darda3/login.do");
	
	WebElement usernameTb = driver.findElement(By.name("username"));
	usernameTb.sendKeys("admin");
	
	WebElement passwordTb = driver.findElement(By.name("pwd"));
	passwordTb.sendKeys("manager");
	
	//using method chaning
	//driver.findElement(By.id("loginButton")).click();
	
	//using refference variable
	WebElement loginButton = driver.findElement(By.id("loginButton"));
	
	loginButton.click();
	}

}
