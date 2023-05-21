package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValueMethod2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/ADMIN/Desktop/WCSM8/multilevelDropdown.html");
		WebElement dropdown = driver.findElement(By.id("i1"));
		
		//using single option for multiselect dropdown
		
		Select sel = new Select(dropdown);
		Thread.sleep(2000);
		sel.selectByValue("v5");
		
		//using multiple options for multiselect dropdown
		
		for(int i=0; i<5; i++)
		{
			sel.selectByIndex(i);
		}
		
		
	}

}
