package operationMethos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod2 {
	
	//verify staticdropdown type

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//by using multi slecet dropdown
	
	driver.get("file:///C:/Users/ADMIN/Desktop/WCSM8/multilevelDropdown.html");
	WebElement dropdown = driver.findElement(By.name("menu"));
	Select sel = new Select(dropdown);
	boolean verifyType = sel.isMultiple();
	System.out.print(verifyType);
	
		
	}

}
