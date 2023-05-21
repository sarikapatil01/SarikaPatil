package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//a[normalize-space()='Logout']/..//a[normalize-space()='Logout']") private WebElement logoutLink;
	@FindBy(xpath="/HTML/BODY/DIV/DIV[1]/TABLE/TBODY/TR[1]/TD[5]/A/IMG") private WebElement taskImg;
	@FindBy(xpath="//A[@class='content reports']/IMG[@class='sizer']/self::IMG") private WebElement reportImg;
	@FindBy(xpath="//A[@class='content users']/IMG[@class='sizer']/self::IMG") private WebElement usersImg;
	
	
	
	//Initialization all the element
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getLogoutLink() 
	{
		return logoutLink;
	}
	public WebElement getTaskImg()
	{
		return taskImg;
	}
	public WebElement getReportImg()
	{
		return reportImg;
	}
	public WebElement getUsersImg()
	{
		return usersImg;
	}
	
	//Operations
	
	public void usersModuleMethod()
	{
		usersImg.click();
	}
	
	public void logOut()
	{
		logoutLink.click();
	}

}
