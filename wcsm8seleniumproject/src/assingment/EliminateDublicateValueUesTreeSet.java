package assingment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDublicateValueUesTreeSet {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/ADMIN/Desktop/WCSM8/SingleStaticDropdownWebElement.html");
	WebElement dropdowm = driver.findElement(By.name("menu"));
	
	//to handle dropdowm to create object frome select class
	
	Select sel = new Select(dropdowm);
	
	// to get all options frome dropdown
	
	List<WebElement> allOptions = sel.getOptions();
	
	//to eliminate the dublicate & maintain order of insertion we use TreeSet
	
	TreeSet<String> ts = new TreeSet<String>();
	
	//to read the list by eliminating dublicate options
	
	for(int i=0; i<allOptions.size(); i++)
	{
		
		//get the options & text of options
		String op = allOptions.get(i).getText();
		
		//add the text of options to TreeSet
		ts.add(op);
	}
	
	//to read the options frome set
	for(String options:ts)
	{
		Thread.sleep(2000);
		System.out.println(options);
	}
	
	}
	

}
