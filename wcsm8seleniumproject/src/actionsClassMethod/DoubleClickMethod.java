package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) throws InterruptedException {
		
	//to launch ChromeBrowser
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//to open ActiTime apllication
	driver.get("http://desktop-3darda3/login.do");
	
	//handle login page in valid inputs
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	//click on setting in home page
	driver.findElement(By.xpath("//A[@class='content administration']/IMG[@class='sizer']")).click();
	
	//click on logo and color
	driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
	
	//click redio button
	driver.findElement(By.id("uploadNewLogoOption")).click();
	
	//findout the file button
	WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	
	//we need to create object Actions classs
	Actions act = new Actions(driver);
	
	//double click on file button
	act.doubleClick(target).perform();
	
	//close the browser
	Thread.sleep(2000);
	driver.quit();
	
			
	
	
	}

}
