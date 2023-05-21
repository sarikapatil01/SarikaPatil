package automation_task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[.='✕']")).click();
	
	
	 driver.findElement(By.name("q")).sendKeys("mobiles");
	 
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//click Apple
	driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='APPLE')]")).click();
	//click on reting of mobile
	driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='4★ & above')]")).click();
	//click on RAM
	driver.findElement(By.xpath("//div[@class='_3879cV' and (.='1GB and Below')]")).click();
	
	
	
	
	
	}
	
	

}
