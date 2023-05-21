package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath3 {

	public static void main(String[] args) throws InterruptedException {
		
		//xpath by using contains function

System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver	driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.airasia.co.in/home");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'flight-search-source-feild-input')]  ")).sendKeys("pune");
		
	}

}
