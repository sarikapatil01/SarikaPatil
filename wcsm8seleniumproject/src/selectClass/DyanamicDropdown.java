package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DyanamicDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Admin']")).click();
	WebElement dropdown = driver.findElement(By.xpath("//span[text()='Job ']"));
	dropdown.click();
	
	Select sel = new Select(dropdown);
	
	//using single option select for single select Dropdown
	
	sel.selectByIndex(2);
	
	
	
	
	
	
	}

}
