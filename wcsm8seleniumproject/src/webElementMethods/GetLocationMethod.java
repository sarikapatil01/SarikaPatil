package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {

		System.setProperty("webdeiver.chrome.driver", "./drivers/chromedriver.exe");
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement login = driver.findElement(By.xpath("//button[text()=' Login ']"));
	
	Point value = login.getLocation();
	
	int xaxis = value.getX();
	int yaxis = value.getY();
	
	System.out.println("X axis :"+xaxis+",Y axis :"+yaxis);
	
	
	
	}

}
