package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/ADMIN/Desktop/WCSM8/multilevelDropdown.html");
	WebElement dropdown = driver.findElement(By.name("menu"));
	
	//using single option select  for multiple dropdown
	
	Select sel = new Select(dropdown);
	sel.selectByIndex(2);
	
	//using multiple options select for multiple dropdown
	
	for(int i=0; i<5; i++)
	{
		sel.selectByIndex(i);
	}
	}

}
