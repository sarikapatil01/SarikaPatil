package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Store all the WebElement of LoginPage by using @FindBy Annotation
 
	@FindBy(name="username") private WebElement usernameTB;
	@FindBy(name="pwd") private WebElement passwordTB;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(name="remember") private WebElement checkBox;
	@FindBy(xpath="//a[.='Actimind Inc.']") private WebElement actiMindLink;
	
	//Initialization all the elements
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	
	public WebElement getUsernameTB() 
	{
		return usernameTB;
	}
		public WebElement getPasswordTB()
	{
		return passwordTB;
	}
	public WebElement getLoginButton()
	{
		return loginButton;
	}
	public WebElement getCheckBox() 
	{
		return checkBox;
	}
	public WebElement getActiMindLink()
	{
		return actiMindLink;
	}


	
	
	//Operational Methods
	
	public void validLoginPage(String validUsername , String validPassword)
	{
		usernameTB.sendKeys(validUsername);
		passwordTB.sendKeys(validPassword);
		loginButton.click();
		
	}
	
	public void invalidLogin(String invalidUsername, String invalidPassword) throws InterruptedException
	{
		usernameTB.sendKeys(invalidUsername);
		passwordTB.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(2000);
		usernameTB.clear();
	}
}
