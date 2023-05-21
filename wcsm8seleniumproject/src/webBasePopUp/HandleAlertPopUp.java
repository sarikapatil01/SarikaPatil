package webBasePopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/ADMIN/Desktop/WCSM8/AlertPopUp.html");
		
		//to create Alert PopUp
		driver.findElement(By.xpath("//button[.='click me!']")).click();
		Thread.sleep(2000);
		
		//to handle PopUp
		Alert al = driver.switchTo().alert();
		
		//al.accept();
		System.out.println(al.getText());
		al.dismiss();

	}

}
