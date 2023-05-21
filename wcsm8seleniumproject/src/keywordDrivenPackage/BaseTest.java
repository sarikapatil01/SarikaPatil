package keywordDrivenPackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IAutoConstant{
	
	static WebDriver driver;
	
	public void openBrowser() throws FileNotFoundException, IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROPERTY_PATH, "browser");
		String loginUrl = flib.readPropertyData(PROPERTY_PATH, "url");
		//System.out.println(browserValue+""+loginUrl);
		
		//using RunTime Polymorphism  to launch the browser using generic reusable method
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(loginUrl);
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(FIREFOX_KEY, FIREFOX_PATH);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(loginUrl);
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			System.setProperty(EDGE_KEY,EDGE_PATH);
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(loginUrl);
		}
		else {
			System.out.println("Invalid Browser Value!!");
			
		}
	}
	//create generic reusable method to close the method
		public void closeBrowser()
		{
			driver.quit();
		}

}
