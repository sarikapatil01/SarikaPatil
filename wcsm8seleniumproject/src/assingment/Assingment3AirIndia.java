package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assingment3AirIndia {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver	driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.airindia.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune, Lohegaon Airport, PNQ, India, IN");
		driver.findElement(By.xpath("//input[@id='to']")).sendKeys("Kochi, Cochin International Airport, COK, India, IN");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='_depdateeu1']")).sendKeys("20/04/23");
		Thread.sleep(2000);
		
	}

}
