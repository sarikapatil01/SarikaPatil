package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumPageAssingmentEdgeBrowser {

	public static void main(String[] args) throws AWTException, InterruptedException {

		//launch Edge Browser
				System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
				WebDriver	driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//open selenium WebPage
				driver.get("https://www.selenium.dev/");
				
				//Identify the WebElement
				WebElement target = driver.findElement(By.xpath("//div[@class='row justify-content-center td-box--100 pt-5']"));
				
				//to user RightClick action
				Actions act = new Actions(driver);
				act.contextClick(target).perform();
				
				//use Keys Method we need to create robot class
				Robot robot = new Robot();
				
				//go to Inspect using for loop
				for(int i=0; i<=15; i++)
				{
					robot.keyPress(KeyEvent.VK_DOWN);
					Thread.sleep(2000);
					robot.keyRelease(KeyEvent.VK_DOWN);
				}
				
				//to click on Inspect using Key method
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
	}

}
