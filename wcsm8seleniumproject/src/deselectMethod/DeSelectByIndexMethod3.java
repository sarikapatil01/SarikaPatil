package deselectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByIndexMethod3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/ADMIN/Desktop/WCSM8/multilevelDropdown.html");
	WebElement dropdown = driver.findElement(By.name("menu"));
	Select sel = new Select(dropdown);
	
	// using multiple select options
	for(int i=0; i<6; i++)
	{
		if(i%2==0)
		{
		Thread.sleep(2000);
		sel.selectByIndex(i);
		}
		else {
			System.out.println("it's odd");
		}
	}
	Thread.sleep(2000);
	for(int i=0; i<6; i++)
	{
		if(i%2==0)
		{
			Thread.sleep(2000);
			sel.deselectByIndex(i);
		}
		
	}
	}

}