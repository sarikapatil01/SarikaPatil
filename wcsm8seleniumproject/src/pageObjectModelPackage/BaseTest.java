package pageObjectModelPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IAutoConstant {
	
	static WebDriver driver;
	
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROPERTY_PATH, "browser");
		String loginURL = flib.readPropertyData(PROPERTY_PATH, "url");
		
		//Using Runtime Polymorphism to launch the browsers in generic reusable method
		if(browserValue.equalsIgnoreCase("Chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(loginURL);
		}
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			System.setProperty(FIREFOX_KEY, FIREFOX_PATH);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(loginURL);
		}
		else if(browserValue.equalsIgnoreCase("Edge"))
		{
			System.setProperty(EDGE_KEY, EDGE_PATH);
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(loginURL);
		}
		else {
				System.out.println("Invalid Browser Name!!");
		}
		
	}
	
	public void tearDown()
	{
		driver.quit();
	}

}
