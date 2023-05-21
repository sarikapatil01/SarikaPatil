package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SendKeysMethod3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	WebDriver	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/");
	WebElement textB = driver.findElement(By.id("email"));
	textB.sendKeys("Sari@gmail.com");
	WebElement passwordTb = driver.findElement(By.id("pass"));
	passwordTb.sendKeys("****");
	}

}
