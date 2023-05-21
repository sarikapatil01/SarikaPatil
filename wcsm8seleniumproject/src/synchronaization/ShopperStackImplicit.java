package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ShopperStackImplicit {

	public static void main(String[] args) {

		System.setProperty("webdrver.chrome.driver", "./derivers/chromedriver.exe");
		
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.shoppersstack.com/");
	driver.findElement(By.xpath("//img[@alt='Noise ColorFit Pulse Spo2 Smart Watch']")).click();
	
	driver.findElement(By.name("Check Delivery")).sendKeys("134677983");
	 
	//applly the explicit wait
	
	WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	WebElement CheckButton = driver.findElement(By.id("Check"));
	
	Wait.until(ExpectedConditions.elementToBeClickable(CheckButton)).click();
		
	
		
	}

}
