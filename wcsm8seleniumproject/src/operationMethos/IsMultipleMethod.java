package operationMethos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
	
	//verify Static DropDown type

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	// verify single select dropdown
	driver.get("file:///C:/Users/ADMIN/Desktop/WCSM8/SingleStaticDropdownWebElement.html");
	WebElement dropdown = driver.findElement(By.name("menu"));
	Select sel = new Select(dropdown);
	boolean multipleType = sel.isMultiple();
	System.out.println(multipleType);

		
	}

}
