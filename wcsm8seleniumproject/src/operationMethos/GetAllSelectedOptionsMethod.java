package operationMethos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {
	
	//use to get selected options

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//using multiselect dropdown 
	
	driver.get("file:///C:/Users/ADMIN/Desktop/WCSM8/multilevelDropdown.html");
	WebElement dropdown = driver.findElement(By.name("menu"));
	Select sel = new Select(dropdown);
	
	//get all the selected options using for loop
	
	for(int i=0; i<5; i++)
	{
		sel.selectByIndex(i);
	}
	
	List<WebElement> allOptions = sel.getAllSelectedOptions();
	
	// read the selected options
	
//	for(int i=0; i<allOptions.size(); i++)
//	{
//		String option = allOptions.get(i).getText();
//		System.out.println(option);
//	}
	
	//using advanced loop
	
	for(WebElement op:allOptions)
	{
		String option = op.getText();
		System.out.println(option);
	}
	}

}
