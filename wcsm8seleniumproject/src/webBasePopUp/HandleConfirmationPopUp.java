package webBasePopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/ADMIN/Desktop/WCSM8/confermationPopup.html");
		
		//create a PopUp
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//to handle PopUp
		Alert al = driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		Thread.sleep(2000);
		al.dismiss();

		
		
	}

}
