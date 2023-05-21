package methodOfWebDriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ManageMethodFirefox {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	WebDriver	driver=new FirefoxDriver();
	
	
	driver.manage().window().maximize();
	
		Dimension targetSize = new Dimension(350, 450);
		driver.manage().window().setSize(targetSize);
		Thread.sleep(2000);
		
		Point position = new Point(350, 450);
		driver.manage().window().setPosition(position);
		Thread.sleep(2000);
	}
	

}