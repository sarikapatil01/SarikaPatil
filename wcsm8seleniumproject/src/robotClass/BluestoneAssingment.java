package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneAssingment {

	public static void main(String[] args) throws AWTException, InterruptedException {
	
	//Launch chrome browser
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//open buestone webapplication
	driver.get("https://www.bluestone.com/");
	
	//handle popup
	driver.findElement(By.id("denyBtn")).click();
	
	//Identify WatchJewellery WebElement
	WebElement watchJewellery = driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
	
	//to create object Action class
	Actions act = new Actions(driver);
	
	//move to the elemrnt
	act.moveToElement(watchJewellery).perform();
	
	//click on band
	driver.findElement(By.xpath("//a[.='Band']")).click();
	
	//Identify webElement FilterBy
	WebElement filterBy = driver.findElement(By.xpath("//div[.='Filter by']"));
	Thread.sleep(2000);
	for(int i=0; i<=2; i++)
	{
		act.clickAndHold(filterBy).perform();
	}
	
	//create object Robot class
	Robot robot = new Robot();
	
		//copy the WebElement (Filter By)

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
	
		//Ientify the WebElement to Search box
		driver.findElement(By.name("search_query")).click();
	 
		//paste the filter by
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
	 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
	
	
		//Identify the Search button WebElement
		WebElement searchBox = driver.findElement(By.name("submit_search"));
		searchBox.submit();
		
	
	
	
	
	}

}
