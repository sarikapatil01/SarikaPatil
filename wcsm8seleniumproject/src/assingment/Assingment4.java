package assingment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assingment4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	WebDriver	driver=new ChromeDriver(co);
	
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("mobiles");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	
	List<WebElement> options = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	
	List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
	
	for(int i=0; i<=options.size(); i++)
	{
			String mobilenames = options.get(i).getText();
			
			
		for(int j=i; j<=i; j++)
		{
				String priceofMobile = allOptions.get(j).getText();
			
				System.out.print("Name of the Mobile :"+mobilenames+"price of the Mobile :"+priceofMobile);
				
		}
		System.out.println();
		
	}
	
	}

}
