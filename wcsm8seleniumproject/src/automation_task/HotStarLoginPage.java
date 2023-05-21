package automation_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HotStarLoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	WebDriver	driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	
	driver.get("https://www.hotstar.com/");
	
	driver.findElement(By.xpath("//span[@class=' text-transparent LOGO_LABEL_TYPOGRAPHY ']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='7']")).sendKeys("2342323563");

	}

}
