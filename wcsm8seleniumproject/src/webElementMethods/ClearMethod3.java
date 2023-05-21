package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ClearMethod3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
	WebDriver	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/");
	
	WebElement email = driver.findElement(By.name("email"));
	WebElement pass = driver.findElement(By.name("pass"));
	
	email.sendKeys("Sari@gmai.com");
	pass.sendKeys("Saru123");
	
	email.clear();
	pass.clear();
	}

}
