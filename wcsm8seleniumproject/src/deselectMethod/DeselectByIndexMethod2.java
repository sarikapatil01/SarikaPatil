package deselectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndexMethod2 {

	public static void main(String[] args) throws InterruptedException  {

		//using multiselect options for multiple Dropdown
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/ADMIN/Desktop/WCSM8/multilevelDropdown.html");
	
	WebElement dropdown = driver.findElement(By.id("i1"));
	Select sel = new Select(dropdown);
	//using single select option for multiple dropdown
	
	sel.selectByIndex(2);
	Thread.sleep(2000);
	sel.deselectByIndex(2);

	//using multiple options deselectd for multiple dropdown
	

	for(int i=0; i<=5; i++)
	{
		sel.selectByIndex(i);
		Thread.sleep(2000);
		sel.deselectByIndex(i);
		
	}
	
	
	}

}
