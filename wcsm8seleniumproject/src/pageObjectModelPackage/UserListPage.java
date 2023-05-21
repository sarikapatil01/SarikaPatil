package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
	
	@FindBy(xpath="//input[@value='Create New User']") private WebElement createNewUserButton;
	@FindBy(xpath="//*[@name='username']") private WebElement usernameTB;
	@FindBy(xpath="//*[@name='passwordText']") private WebElement passwordTB;
	@FindBy(xpath="//*[@name='passwordTextRetype']") private WebElement passwordReTextType;
	@FindBy(xpath="//*[@name='firstName']") private WebElement FirstNameTB;
	@FindBy(xpath="//*[@name='lastName']") private WebElement LastNameTB;
	@FindBy(xpath="//input[@type='submit']") private WebElement CreateUserButton;
	@FindBy(xpath="//input[@onclick=\"cancelForm(messageResource.getMessage('user.add.cancel_button_confirm'), '/administration/userlist.do')\"]") private WebElement cancelButton;
	@FindBy(xpath = "(//a[contains(text(),'System,')]/ancestor::tbody/descendant::a)[1]") private WebElement userCreatedLink;
	@FindBy(xpath="//input[@id='cleanupDemoDataButton']") private WebElement deletUserButton;
	
	//utilization
	  public UserListPage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    }
	//initilization
	
	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}
	public WebElement getUsernameTB() {
		return usernameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public WebElement getPasswordReTextType() {
		return passwordReTextType;
	}
	public WebElement getFirstNameTB() {
		return FirstNameTB;
	}
	public WebElement getLastNameTB() {
		return LastNameTB;
	}
	public WebElement getCreateUserButton() {
		return CreateUserButton;
	}
	public WebElement getCancelButton() {
		return cancelButton;
	}
	public WebElement getLinkCheckBox() {
		return userCreatedLink;
	}
	public WebElement getDeletUser() {
		return deletUserButton;
	}	
	
	//Operation method
	public void createUserMethod(String un , String pass, String fn, String ln) throws InterruptedException
	{
		Thread.sleep(2000);
		createNewUserButton.click();
		Thread.sleep(2000);
		usernameTB.sendKeys(un);
		passwordTB.sendKeys(pass);
		passwordReTextType.sendKeys(pass);
		FirstNameTB.sendKeys(fn);
		LastNameTB.sendKeys(ln);
		CreateUserButton.click();
		
		
	}
	
	public void deletUserMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		userCreatedLink.click();
		Thread.sleep(2000);
		deletUserButton.click();
		Thread.sleep(2000);
		 
		WorkLib wl = new WorkLib();
		wl.handleConfermationPopup();
		
	}
	
	
	

}
