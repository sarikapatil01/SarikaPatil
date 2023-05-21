package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeTestCase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver	driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-3darda3/login.do");
		
		//using explicit wait
		
		String loginPageTitle = driver.getTitle();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		if(wait.until(ExpectedConditions.titleContains(loginPageTitle)))
		{
			System.out.println("lagin page title is match, testcase is pass");
			
			driver.findElement(By.name("username")).sendKeys("admin");
			
			driver.findElement(By.name("pwd")).sendKeys("manager");
							
			driver.findElement(By.id("loginButton")).click();
		}
		else {
			System.out.println("Login page title is not match,Testcase is fail");
		}
	
			String homePageTitle = driver.getTitle();
			
			if(wait.until(ExpectedConditions.titleContains(homePageTitle)))
			{
				System.out.println("Home page title is match, testcase is pass");
				
			}
			else {
				System.out.println("Home page title is not match, testcase is fail");
			}
		}
		
		
	}


