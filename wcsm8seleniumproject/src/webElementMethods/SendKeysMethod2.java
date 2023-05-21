package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendKeysMethod2 {

	public static void main(String[] args) {

		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	WebDriver	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.instagram.com/");
	WebElement usernameTb = driver.findElement(By.name("username"));
	usernameTb.sendKeys("Sarika");
	WebElement passwordTb = driver.findElement(By.name("password"));
	passwordTb.sendKeys("sari12@gmail.com");
	}

}
