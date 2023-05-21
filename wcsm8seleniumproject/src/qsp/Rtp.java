package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {

	public static void main(String[] args) throws InterruptedException {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("type the browser which you want to launch");
			String browservalue = sc.next();
			
			if(browservalue.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				
			WebDriver	driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			
			}
			else if(browservalue.equalsIgnoreCase("Firefox"))
			{
				//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				
				WebDriver	driver=new FirefoxDriver();
				driver.manage().window().maximize();

				Thread.sleep(2000);
				
				
				driver.close();
				
			}
			else if(browservalue.equalsIgnoreCase("Edge"))
			{
				System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
				
			WebDriver	driver=new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
				
			}
			else {
				System.out.println("this browser value is not avileble");
			}
		}

	}


