package operationMethos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/ADMIN/Desktop/WCSM8/SingleStaticDropdownWebElement.html");
	WebElement dropdown = driver.findElement(By.name("menu"));
	
	Select sel = new Select(dropdown);
	
	//using for loop
	for(int i=3; i<5; i++)
	{
		sel.selectByIndex(i);
	}
	WebElement firstOption = sel.getFirstSelectedOption();
	String value = firstOption.getText();
	System.out.println(value);
	

	}

}
