package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args)  {
		
	//to launch the chrome browser
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//to launch bluestone application
	driver.get("https://www.bluestone.com/");
	
	//click on not now popup
	driver.findElement(By.id("denyBtn")).click();
	
	//identify Pendents
	WebElement target = driver.findElement(By.xpath("//a[.='Pendants ']"));
	
	//create object of Actions class
	Actions act = new Actions(driver);
	
	//move to element
	act.moveToElement(target).perform();
	
	//click on diamond
	driver.findElement(By.xpath("//a[@title='Diamond Pendants' and text()='Diamond']")).click();
	
	//identify diamond
	
	WebElement diamond = driver.findElement(By.xpath("//img[@alt='Structural silhouettes from the future']"));
	//findout diamond is display or not
	if(diamond.isDisplayed())
	{
		System.out.println("diamond is displayed");
	}
	else {
		System.out.println("Diamond is not displayed");
	}
	}

}
