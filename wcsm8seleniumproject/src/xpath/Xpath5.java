package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath5 {

	public static void main(String[] args) throws InterruptedException {
		
		//Xpath by using axes
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver	driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get(" https://in.puma.com/in/en");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Men']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@role='menuitem']/descendant::span[contains(text(),'Walking')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='PUMA Black-PUMA White']")).click();

	}

}
