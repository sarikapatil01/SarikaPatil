package windowBasePopUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {

	public static void main(String[] args) throws IOException, InterruptedException {

	//To launch the Browser
		System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	//To open ActiTime WebApplication
		driver.get("http://desktop-3darda3/login.do");
	
	//Login the ActiTime
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	
	//click on Setting in Home Page
		driver.findElement(By.xpath("//div[.='Settings']/following-sibling::img[@class='sizer']")).click();
		
	//click on logo and Color
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		
	//Click on redio button
		driver.findElement(By.id("uploadNewLogoOption")).click();
		
	//FindOut the File Button
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
	//we need to create a Object of action class
		Actions act = new Actions(driver);
		
	//Double click of file button
		act.doubleClick(target).perform();
		
	//To handle Window Base PopUP
	 File file = new File("./autoit/uploadfile.exe");
	 String abs = file.getAbsolutePath();
	 Thread.sleep(2000);
	 Runtime.getRuntime().exec(abs);
	 Thread.sleep(4000);
	Runtime.getRuntime().exec(abs);
		
	//close the browser
		driver.quit();
		
	}

}
