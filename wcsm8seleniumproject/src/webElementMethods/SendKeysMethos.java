package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethos {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("http://desktop-3darda3/login.do");
	
	//using Method Chaning
	
	/*driver.findElement(By.name("username")).sendKeys("admin");
	
	*/driver.findElement(By.name("pwd")).sendKeys("admin");
	
	//using refference of Variable
	
	WebElement usernameTextBox = driver.findElement(By.name("username"));
	
	usernameTextBox.sendKeys("admin");
	
	WebElement passwordTextBox = driver.findElement(By.name("pwd"));
	
	passwordTextBox.sendKeys("manager");
	
	}

}
