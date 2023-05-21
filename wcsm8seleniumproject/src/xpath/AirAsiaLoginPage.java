package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirAsiaLoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	WebDriver	driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	
	driver.get("https://www.airasia.com/en/gb");
	
	driver.findElement(By.xpath("//div[@id='login']")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='text-input--login']")).sendKeys("sarikapatil2525@gmail.com");
	
	driver.findElement(By.xpath("//input[@id='password-input--login']")).sendKeys("Sarika@2525");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='loginbutton' and @type='submit']")).click();
	
	
	}

}
