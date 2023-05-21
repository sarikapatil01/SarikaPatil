package assingment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment7 {
	
	//select dropdown without using selection method

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//using single selectdropdown
	
	driver.get("file:///C:/Users/ADMIN/Desktop/WCSM8/SingleStaticDropdownWebElement.html");
	WebElement dropdown = driver.findElement(By.name("menu"));
	Select sel = new Select(dropdown);
	List<WebElement> allOptions = sel.getOptions();
	//select option using click medhod
	for(WebElement op:allOptions)
	{
		if(op.getText().equals("chakli"))
		{
			Thread.sleep(2000);
			op.click();
			break;
			
		}
	}
	}

}
