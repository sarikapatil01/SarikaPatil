package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePrintPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {

		//to launch chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//to open selenium webpage
		driver.get("https://www.selenium.dev/");
		
		//create Robot class Object
		Robot robot = new Robot();
		
		//to generet print popup control+P
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_P);
		
		//Shift control to trasfer
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
	
		robot.keyRelease(KeyEvent.VK_TAB);
		
		//click on cancel button using keys method
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
