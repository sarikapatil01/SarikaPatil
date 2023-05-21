package assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-3darda3/login.do");
	
	//String actiTimeLogin = driver.getTitle();
	
	//System.out.println(actiTimeLogin);
	
	if(driver.getTitle().equals("actiTIME - Login"))
	{
		System.out.println("Login page title is match,Testcase is pass");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
						
		driver.findElement(By.id("loginButton")).click();
	}
	else {
		System.out.println("Login page title is not match,Testcase is fail");
	}
		
	if(driver.getTitle().equals("actiTIME-Enter Time Track"))
	{
		System.out.println("Home page title is match,Testcase is pass");
		
		
	}
	else {
		System.out.println("Home page title is not match,Testcase is fail");
	}
		
	}

}
