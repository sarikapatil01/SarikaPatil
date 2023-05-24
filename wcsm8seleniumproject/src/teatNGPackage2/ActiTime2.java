package teatNGPackage2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ActiTime2 {
  @Test
  public void loginMethod() throws InterruptedException 
  {
	  System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	  WebDriver driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://desktop-3darda3/login.do");
	  Thread.sleep(2000);
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  
  }
}
