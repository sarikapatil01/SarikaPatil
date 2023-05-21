package operationMethos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {
	
	//get the options of dropdown

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//using single select dropdown
	
	driver.get("file:///C:/Users/ADMIN/Desktop/WCSM8/SingleStaticDropdownWebElement.html");
	WebElement dropdown = driver.findElement(By.name("menu"));
	Select sel = new Select(dropdown);
	List<WebElement> allOptions = sel.getOptions();
	
	// to read options using for loop
	
//	for(int i=0; i<allOptions.size(); i++)
//	{
//		String option = allOptions.get(i).getText();
//		System.out.println(option);
//		
//	}
	
	// for use advanced loop
	
	for(WebElement op:allOptions)
	{
		String option = op.getText();
		System.out.println(option);
	}
	}

}
