package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleTextMethod2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/ADMIN/Desktop/WCSM8/multilevelDropdown.html");
		WebElement dropdown = driver.findElement(By.name("menu"));
		
		//single select option for multiselect dropdown
		
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("vada");
		Thread.sleep(2000);
		
		//multiple option selected for multiselect dropdown
		
		for(int i=0; i<5; i++)
		{
			sel.selectByIndex(i);
		}
		
	}

}
