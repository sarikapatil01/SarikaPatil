package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	// apply by the implicitaly wait to apper the web elemrnt
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.shoppersstack.com/");
	
	driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__MDlEh']/descendant::img[@alt='Noise ColorFit Pulse Spo2 Smart Watch']")).click();

	
	
	driver.findElement(By.name("Check Delivery")).sendKeys("1245668");
	
	
	// apply by the explicit wait to apper the web element using method
	
	waitMethod(driver,30,"Check").click();
	
	}
	
	   public static WebElement waitMethod(WebDriver driver,int sec,String value)
	   {
		   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(value)));
           return element;
	   }
	
	   
}
