package methodOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ManageMethodEdge {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
	WebDriver	driver=new EdgeDriver();
	
	 driver.manage().window().maximize();
	 
	 Dimension size = new Dimension(350, 450);
	 driver.manage().window().setSize(size);
	 Thread.sleep(2000);
	 
	 Point position = new Point(450, 350);
	 driver.manage().window().setPosition(position);
	 Thread.sleep(2000);
	 
	}

}
